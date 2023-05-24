import java.util.Locale;
import java.util.Scanner;

public class BelowAverage {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("How many elements will do you type? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Type the " + (i+1) + "° number: " );
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for(int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum/n;
		
		System.out.println("Average of vector: " + avg );
		
		System.out.println("Elements Below of Average:");
		for(int i=0; i<n; i++) {
			if(vect[i] < avg) {
				System.out.println(vect[i]);
			}
			
		sc.close();
		}
	}

}
