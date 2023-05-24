import java.util.Scanner;

public class NegativeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar de 0 a 10: ");
		int n = sc.nextInt();
		
		if (n <= 10) {
			int [] vect = new int[n];
			for (int i=0; i<n; i++) {
				vect[i] = sc.nextInt();
			}
			
			System.out.printf("%nNUMEROS NEGATIVOS: %n");
			for(int i=0; i<n; i++) {
				if(vect[i] < 0) {
					System.out.println(vect[i]);
				}
			}
		} 
		else {
			System.out.println("Quantidade de números inválidos");
		}
		
		sc.close();
	}

}
