import java.util.Locale;
import java.util.Scanner;

public class higherPosition {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you type? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		int higner = 0, position = 0;
		
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if (i == 0) {
				vect[i] = higner;
			}
			if (vect[i] > higner) {
				higner = vect[i];
				position = i ;
			}
		}
		
		System.out.println("Value higner: " + higner);
		System.out.println("Position value higner: " + position);
		sc.close();
	}

}
