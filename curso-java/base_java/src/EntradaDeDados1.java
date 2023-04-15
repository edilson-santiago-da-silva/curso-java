import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // formataçao dos EUA
		
		Scanner sc = new Scanner(System.in); // criação do objeto tipo Scanner / atalho > ctrl+ sift + O importação automática
		
		
		String x; // declarando a variável e seu tipo String
		
		x = sc.next(); // Lendo a entrada de dados e amarzenando dentro da memória na variável x
		System.out.println("Você digitou: " + x); 
		System.out.println("------------------");
		
		int n; // declarando a variável e seu tipo int
		
		n = sc.nextInt();  // Lendo a entrada de dados e amarzenando dentro da memória na variável n
		System.out.println("Você digitou o número: " + n);
		System.out.println("------------------");
		
		double d;
		
		d = sc.nextDouble(); // Para ler um número com ponto flutuante
		System.out.println("Você digitou o número double:" + d);
		System.out.println("------------------");
		
		char c;
		
		c = sc.next().charAt(0); // Para ler um caractere. A função charAt(0) pega o primeiro caracter da String
		System.out.println("Você digitou o caracter:" + c);
		System.out.println("------------------");
		
		String xv;
		int yv;
		double dv;
		
		xv = sc.next();  // ler vários dados na mesma linha. obs: precisa dar um espaço na entrada dos Dados.
		yv = sc.nextInt();
		dv = sc.nextDouble();
		System.out.println(xv);
		System.out.println(yv);
		System.out.println(dv);
		
		
		
		sc.close(); // finalizar o uso do objeto.
		
		
		
	}

}
