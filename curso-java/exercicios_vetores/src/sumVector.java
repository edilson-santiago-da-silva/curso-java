import java.util.Locale;
import java.util.Scanner;

public class sumVector {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de números: ");
		int n = sc.nextInt();
		double [] vect = new double[n];
		
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();	
		}
		
		System.out.print("VALORES = ");
		for(int i=0; i<n; i++)	{
			System.out.print(" " + vect[i]);
		}
		
		double sum = 0.0;
		System.out.printf("%nSOMA = ");
		for(int i=0; i<n; i++) {
			sum += vect[i];
		}
		System.out.print(sum);
		
		System.out.printf("%nMEDIA = ");
		double m = sum/n;
		
		System.out.println(m);
		sc.close();
	}

}
