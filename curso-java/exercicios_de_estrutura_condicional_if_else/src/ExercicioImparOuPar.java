import java.util.Scanner;

public class ExercicioImparOuPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		double par;
		
		System.out.print("Digite um número: ");
		n = sc.nextInt();
		par = n % 2;
		
		
		if (par == 0) {
			System.out.println("Número PAR");
		}
		else {
			System.out.println("Número IMPAR");
		}
		
		sc.close();
	}

}
