import java.util.Scanner;

public class exercicioNumeroInteiro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Número: ");
		n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		sc.close();
	}
}
