package staticMembers.version3.programCircus3;

import java.util.Locale;
import java.util.Scanner;

import staticMembers.version3.util3.Calculator3;



public class ValueCircus3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Radius:");
		double radius =  sc.nextDouble();
		
		double c = Calculator3.circumference(radius);
		
		double v = Calculator3.volume(radius);
		
		System.out.printf("Circumference: %,2f%n", c);
		System.out.printf("volume: %,2f%n", v);
		System.out.printf("PI value: %,2f%n", Calculator3.PI);
		
		sc.close();
	}

}
