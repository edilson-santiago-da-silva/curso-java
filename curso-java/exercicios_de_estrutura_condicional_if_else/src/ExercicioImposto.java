import java.util.Locale;
import java.util.Scanner;

public class ExercicioImposto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double imposto;
		
		if (salario > 2000 ) {
			if(salario <= 3000) {
				imposto = (salario - 2000) * 8/100;
				System.out.printf("Imposto a pagar: R$ %.2f " ,imposto);
			}
			else if (salario <= 4500) {
				imposto = (((salario - 2000) - 1000) * 18/100) + 1000 * 8/100;
				System.out.printf("Imposto a pagar: R$ %.2f " ,imposto);
			}
			else {
				imposto = ((salario - 4500) * 28/100) + 1000 * 8/100 + 1500 * 18/100; 
				System.out.printf("Imposto a pagar: R$ %.2f " ,imposto);
			}
		}
		else {
			System.out.println("Isento");
		}
		sc.close();
	}

}
