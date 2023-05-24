import java.util.Locale;
import java.util.Scanner;

public class NumberEvenOdd {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you type? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("number " + (i + 1) + "°: ");
			vect[i] = sc.nextInt();
		}
		int c = 0;
		System.out.print("Numbers even: ");
		for(int i=0; i<n; i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(" " + vect[i]);
				c += 1;
			}
		}
		
		System.out.printf("%nQuantity number oven: " + c);
		sc.close();
	}

}
