package programValueRectangle;

import java.util.Locale;
import java.util.Scanner;

import entitiesRectangle.Rectangle;

public class ProgramRectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		if (rectangle.width != rectangle.height) { 
			
			System.out.printf("Area: %.2f ", rectangle.area());
			
			System.out.printf("Perimeter: %.2f ", rectangle.perimeter());
			
			System.out.println();
			System.out.printf("Diagonal: %.2f ", rectangle.diagonal());
		} 
		else {
			System.out.println("Width and height cannot be the same");
		}
		sc.close();
	}

}
