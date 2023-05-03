package programStaticDolar;

import java.util.Locale;
import java.util.Scanner;

import entitiesStaticDolar.CurrencyConverter;

public class ProgramDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter.converter(dollar, amount);
		
		System.out.printf("Amount to be paid in reais = %.2f ", result);
		
		
		sc.close();
	}

}
