import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double horas;
		
		System.out.print("Qual o horário Agora: ");
		horas = sc.nextDouble();
		
		if (horas < 12) {
			System.out.println("Bom dia!");
		}
		else if (horas < 18) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa noite!");
		}
		
		sc.close();
	}

}
