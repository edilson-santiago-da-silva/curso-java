import java.util.Scanner;

public class ExercicioNumeroAoQuadradoEAoCubo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int quadrado, cubo ;
		for (int i = 1; i <= n; i++) {
			quadrado = i*i;
			cubo = i*i*i;
			
			System.out.printf("%d %d %d %n", i, quadrado, cubo);
		}
		System.out.println("---------------------------------");
		System.out.println( "");
		System.out.println( "");
		sc.close();
		
	}

}
