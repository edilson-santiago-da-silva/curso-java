import java.util.Scanner;

public class EstruturaDeRepeticaoFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual será o número de repitição: ");
		int N = sc.nextInt();
		System.out.println("---------------------------------");
		
		int soma = 0 ;
		
		for (int i = 0; i<N ; i=i+1) { // Essa incrementação "i=i+1" pode ser simplificada para "i++".
			int x = sc.nextInt();      // Sintaxe e regra laço For --> for ( início ; condição ; incremento) { }. --> o início so executa uma vez. incremento executa toda vez que volta ou seja no primeira vez que entra no laço não executa.
			soma = soma + x;
			
		}
		System.out.print("A soma dos números digitados é: ");
		System.out.println(soma);
		sc.close();
		
		System.out.println("---------------------------------");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Valor de i: " + i); // contagem crescente.
		}
		
		System.out.println("---------------------------------");
		
		for (int i = 4; i >= 0; i--) {
			System.out.println("Valor de i: " + i); // contagem regressiva.
		}
	}

}
