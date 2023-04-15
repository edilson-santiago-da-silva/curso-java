import java.util.Scanner;

public class ExercicioSoma01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		int soma = n1 + n2;
		
		System.out.println("A soma dos números " + n1 + " + " + n2 + " é " + soma);
		
		sc.close();

	}

}
