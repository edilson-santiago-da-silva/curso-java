package applicationTax;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesTax.Company;
import entitiesTax.Individual;
import entitiesTax.TaxPayer;

public class ProgramTax {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + "  data:");
			System.out.print("Individual or Company(i/c)?");
			char ch = sc.next().charAt(0);
			if(ch == 'i') {
				System.out.print("Name:");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double anualIncome = sc.nextDouble();
				System.out.print("Health expenditures:");
				double healthExpenditures = sc.nextDouble();
				
				list.add(new Individual(name, anualIncome, healthExpenditures));
				
			}
			else {
				System.out.print("Name:");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double anualIncome = sc.nextDouble();
				System.out.print("Number of employees:");
				int numberOfEmployees = sc.nextInt();	
				
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		double sum = 0.0;
		System.out.println("TAXES PAID:");
		for(TaxPayer tp : list) {
			//double tax = tp.tax();
			System.out.println(tp.getName() + " $" + String.format("%.2f", tp.tax()));
			sum += tp.tax();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: " + String.format("%.2f", sum));
		
		sc.close();
	}

}
