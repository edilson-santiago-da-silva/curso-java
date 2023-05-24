import java.util.Locale;
import java.util.Scanner;

public class AverageEven {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers will do you type for vector? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Type the " + (i+1) +"° number:");
			vect[i] = sc.nextInt();
		}
		
		int sum =0, c=0, avg=0;
		
		for(int i=0; i<n; i++) {
			if(vect[i] % 2 == 0) {
				sum += vect[i];
				c += 1;
			}
		}
		
		if(c != 0) {
			avg = sum/c;
			System.out.print("Avarege of Even: " + avg);
		}
		else {
			System.out.print("none number even");
		}
		
		
		sc.close();
	}

}
