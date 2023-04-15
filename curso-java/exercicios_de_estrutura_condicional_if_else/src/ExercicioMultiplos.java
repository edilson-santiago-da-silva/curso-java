import java.util.Scanner;

public class ExercicioMultiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, multC, multD;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		multC = a % b; // Poderia usar a simplicação e fazer o resto da divsão dentro do if.
		multD = b % a ;
		
		if (multC == 0 || multD == 0) {  // (a % b == 0 || b % a == 0);
			System.out.println("São Multiplos" );
		}
		else {
			System.out.println("Não são Multiplos " );
		}
		
		sc.close();
	}

}
