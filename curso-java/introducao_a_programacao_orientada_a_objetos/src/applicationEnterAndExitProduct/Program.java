package applicationEnterAndExitProduct;

import java.util.Locale;
import java.util.Scanner;

import entitiesProduct.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		// System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f. %n", product.name, product.price, product.quantity, product.totalValueInStock());
		System.out.println();
		System.out.print("Product data: " + product); // chamando o metodo toString implementado na classe Product
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProduct(quantity);
		
		System.out.println();
		System.out.println("Update data " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProduct(quantity);	
		
		System.out.println();
		System.out.println("Update data " + product);
		
		sc.close();
	}

}
