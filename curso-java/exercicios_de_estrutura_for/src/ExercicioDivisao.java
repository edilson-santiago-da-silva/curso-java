import java.util.Scanner;

public class ExercicioDivisao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double divisao = 0;
			if (n2 == 0 ) {
				System.out.println("---------------------------------");
				System.out.println("Divisão impossível");
			} else {
				divisao = n1 / n2;
				System.out.println("---------------------------------");
				System.out.println(divisao);
			}
		}
		sc.close();

	}

}
