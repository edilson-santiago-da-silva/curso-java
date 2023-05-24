import java.util.Locale;
import java.util.Scanner;

public class SumTwoVector {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many value will be each vector: ");
		int n = sc.nextInt();
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectSum = new int[n];
		
		System.out.println("type the vector values A: ");
		for(int i=0; i<n; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("type the vector values B: ");
		for(int i=0; i<n; i++) {
			vectB[i] = sc.nextInt();
		}
		
		System.out.println("Result: ");
		for(int i=0; i<n; i++) {
			vectSum[i] = vectA[i] + vectB[i];
			System.out.println(vectSum[i]);
			
		}
		sc.close();
	}

}
