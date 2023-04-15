import java.util.Scanner;
import java.util.Locale;

public class ExercicioNumeroDePecas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca, qtdPeca, codigoPeca2, qtdPeca2 ;
		double valorPeca, valorPeca2, total;
		
		codigoPeca = sc.nextInt();
		qtdPeca = sc.nextInt();
		valorPeca = sc.nextDouble();
		
		codigoPeca2 = sc.nextInt();
		qtdPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		total = qtdPeca * valorPeca +  qtdPeca2 * valorPeca2 ;
		
		System.out.printf("VALOR A PAGAR : R$ %.2f", total);
		System.out.printf(" // COD. DAS PEÇAS:  %d - %d ", codigoPeca, codigoPeca2);
		
		sc.close();
	}

}
