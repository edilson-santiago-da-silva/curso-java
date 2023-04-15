import java.util.Scanner;

public class ExercicioHoraFinalJogo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hrInicial, hrFinal, calculoHr ;
		
		hrInicial = sc.nextInt();
		hrFinal = sc.nextInt();
		
		
		if (hrInicial <= 24 && hrFinal <= 24 && hrInicial >= 0 && hrFinal >=0 && hrInicial >= hrFinal  ) {
			calculoHr = 24 - hrInicial + hrFinal ;
			System.out.printf("O JOGO DUROU %d HORAS(S)", calculoHr);
		}
		else if (hrInicial <= 24 && hrFinal <= 24 && hrInicial >= 0 && hrFinal >=0 && hrInicial < hrFinal){
			calculoHr = hrFinal - hrInicial ;
			System.out.printf("O JOGO DUROU %d HORAS(S)", calculoHr);
		}
		else {
			System.out.println("HORA INVÁLIDA, NÃO FOI POSSÍVEL CALCULAR AS HORAS!");
		}
		sc.close();
	}

}
