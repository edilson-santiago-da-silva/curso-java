import java.util.Scanner;

public class EntradaDeDados2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Declaração do Scanner
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt(); //Quando você usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha, essa quebra de linha fica "Espaço pendente" na entrada padrão e é absorvida pelo próximo nextLine().
		sc.nextLine(); // A solução para esse Buffer de leitura é iniciar o nextLine para armazenar o espaço pedente. 
		s1 = sc.nextLine(); // Para ler um texto ATÉ A QUEBRA DE LINHA
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		sc.close();
	}
}