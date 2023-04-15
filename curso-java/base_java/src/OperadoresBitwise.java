import java.util.Scanner;

public class OperadoresBitwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // programa para testar se o 6° bit vale 1. 
		int mask = 0b100000; // ob --> indicação de um número binário, ou posso, colocar o número decimal em formato binário.
		int n = sc.nextInt();
		if ((n & mask) != 0) { // condição --> se o bit a bit for diferente de zero ou seja == 1, eu sei que o sexto bit é 1.
			System.out.println("6th bit is true!");
		} 
		else {
			System.out.println("6th bit is false");
		}
		sc.close();
		
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2); //Operação "E" bit a bit
		System.out.println(n1 | n2); //Operação "OU" bit a bit
		System.out.println(n1 ^ n2); //Operação "OU-exclusivo" bit a bit
		
		// pdf --> 07-outros-topicos-basicos

	}

}
