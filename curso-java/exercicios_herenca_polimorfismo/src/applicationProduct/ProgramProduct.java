package applicationProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesProduct.ImportedProduct;
import entitiesProduct.ProductNational;
import entitiesProduct.UsedProduct;

public class ProgramProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<ProductNational> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Product #"+ i + " data: " );
			System.out.print("Common, used or imported(c/u/i)?");
			char cui = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price:");
			double price = sc.nextDouble();
			
			if(cui == 'i') {
				System.out.print("Customs fee:");
				double customsFee = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, customsFee));
			}
			if(cui == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				list.add(new UsedProduct(name, price, date));
				
			}
			else {
				list.add(new ProductNational(name, price));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (ProductNational prod : list) {
			System.out.println(prod.priceTag());
		}
		sc.close();

	}

}
