import java.util.Locale;
import java.util.Scanner;

public class DebugNoEclipse {
//  Para marcar uma linha de breakpoint:  Run -> Toggle Breakpoint (início do trecho do código que será debugado)

//  Para iniciar o debug:  Botão direito na classe -> Debug as -> Java Application
	
//  Para executar uma linha: F6
	
// 	Para interromper o debug: Botão quadrado vermelho. (Stopar Debug)	
	
//  Para voltar a perspectiva de java vá para o ícone (Tabela pequena com símbolo de mais).
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();
	}

}