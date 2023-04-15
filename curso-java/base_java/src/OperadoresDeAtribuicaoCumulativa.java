import java.util.Scanner;

public class OperadoresDeAtribuicaoCumulativa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double minutos = sc.nextDouble();
		double plano = 50;
		
		if (minutos > 100) {
			plano += (minutos - 100) * 2; // Forma simplificada da expressão:  plano = plano + (minutos - 100) * 2;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", plano);
		sc.close();
	}
}

// a += b;  a = a + b;
// a -= b;  a = a - b;
// a *= b;  a = a * b;
// a /= b;  a = a / b;
// a %= b;  a = a % b;
