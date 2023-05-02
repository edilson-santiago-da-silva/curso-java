package staticMembers.version2.programCircus2;

import java.util.Locale;
import java.util.Scanner;

import staticMembers.version2.util2.Calculator2;

public class ValueCircus2 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Calculator2 calc = new Calculator2();
		
		System.out.println("Enter Radius:");
		double radius =  sc.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %,2f%n", c);
		System.out.printf("volume: %,2f%n", v);
		System.out.printf("PI value: %,2f%n", calc.PI);
		
		sc.close();
	}
}