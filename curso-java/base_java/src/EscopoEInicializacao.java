import java.util.Scanner;

public class EscopoEInicializacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double price = sc.nextDouble();
		
		double discount = 0;
		
		if (price > 100.0) {
			discount = price * 0.1;
		}
		
		System.out.println(discount);
		
		sc.close();
	}

}
// • Escopo de uma variável: é a região do programa onde a variável é  válida, ou seja, onde ela pode ser referenciada.

// • Uma variável não pode ser usada se não for iniciada