import java.util.Scanner;

public class EstruturaSwitchCase {

	public static void main(String[] args) {
		// Quando se tem várias opções de fluxo a serem tratadas com base no valor de
		// uma variável, ao invés de várias estruturas if-else encadeadas, alguns
		// preferem utilizar a estrutura switch-case.
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		if (x == 1) {
			dia = "domingo";
		} 
		else if (x == 2) {
			dia = "segunda";
		} 
		else if (x == 3) {
			dia = "terca";
		} 
		else if (x == 4) {
			dia = "quarta";
		} 
		else if (x == 5) {
			dia = "quinta";
		} 
		else if (x == 6) {
			dia = "sexta";
		} 
		else if (x == 7) {
			dia = "sabado";
		} 
		else {
			dia = "valor invalido";
		}

		int d = sc.nextInt();
		String diaSwitch;
		switch (d) {
		case 1:
			diaSwitch = "domingo";
			break;
		case 2:
			diaSwitch = "segunda";
			break;
		case 3:
			diaSwitch = "terca";
			break;
		case 4:
			diaSwitch = "quarta";
			break;
		case 5:
			diaSwitch = "quinta";
			break;
		case 6:
			diaSwitch = "sexta";
			break;
		case 7:
			diaSwitch = "sabado";
			break;
		default:
			diaSwitch = "valor invalido";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		
		System.out.println("Dia da semana: " + diaSwitch);
	
		sc.close();

	}

}
