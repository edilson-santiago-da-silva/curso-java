import java.util.Scanner;

public class ExpressaoCondicionalTernaria {

	public static void main(String[] args) {
		// Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma condição.
		
		// ( condição ) ? valor_se_verdadeiro : valor_se_falso
		
		// exemplo: (2 > 4) ? 50: 80    >>   resultado: 80
		// exemplo: () ? "Maria" : "Alex"  >>   "Maria"

		Scanner sc = new Scanner (System.in);
		
		double preco = sc.nextDouble();
		double desconto;
		
		double preco1 = sc.nextDouble();
		double desconto1 ;
		
		if (preco > 20.0) {
			desconto = preco * 0.1;
			System.out.println("Condição If e Else - Valor do produto com desconto: " + (preco - desconto));
		}
		else {
			desconto = preco * 0.05;
			System.out.println("Condição If e Else - Valor do produto com desconto: " + (preco - desconto));
		}
		
		desconto1 = (preco1 > 20.0) ? preco1 * 0.1 : preco1 * 0.05;
		
		System.out.println("Condição Ternaria - Valor do produto com desconto: " + (preco1 - desconto1));
		
		sc.close();
	}

}
