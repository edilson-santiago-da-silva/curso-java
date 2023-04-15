import java.util.Locale;
import java.util.Scanner;

public class ExercicioValorAPagar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod, qtd;
		double preco;
		
		cod = sc.nextInt();
		qtd = sc.nextInt();
		
		if(cod == 1) {
			preco = 4.00;
		}
		else if (cod == 2) {
			preco = 4.50;
		}
		else if (cod == 3){
			preco = 5.00;
		}
		else if (cod == 4) {
			preco = 2.00;
		}
		else {
			preco = 1.50;
		}
		System.out.printf("Total: R$ %.2f" , (qtd * preco) );
		
		sc.close();
	}

}
