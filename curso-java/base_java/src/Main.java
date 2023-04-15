import java.util.Locale;

public class Main {

	public static void main(String[] args) {
				System.out.print("Olá mundo!");
				System.out.println("Bom dia!"); //COM QUEBRA DE LINHA
				
				int y = 32;
				System.out.println(y);
				
				double x = 10.35784;
				System.out.println(x);
				System.out.printf("%.2f%n", x);// %.2f > DELIMITAR EM 2 CASAS DECIMAIS - %N > QUEBRA DE LINHA 
				System.out.printf("%.4f%n", x);// f >  FORMATA PARA LINGUAGEM DA SUA MÁQUINA, POR ISSO IMPRIME COM VÍRGULA O N DOUBLE.
				Locale.setDefault(Locale.US);// CONFIG. PARA A FORMATAÇÃO DOS ESTADOS UNIDOS. TUDO QUE VEM DEPOIS SERÁ IMPRIMIDO COM PONTO
				System.out.printf("%.4f%n", x);
				
				System.out.println("RESULTADO = " + x + " METROS"); // CONCATENAR VÁRIOS ELEMENTOS
				
				System.out.printf("RESULTADO = %.2f metros%n", x); // %f = 	PONTO FLUTUANTE  %n = QUEBRA DE LINHA
				
				String nome = "Maria";
				int idade = 31;
				double renda = 4000.0;
				System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); // %s = TEXTO %d = INTEIRO
				// Ctrl + shift + F > alto indentação
	}

}
