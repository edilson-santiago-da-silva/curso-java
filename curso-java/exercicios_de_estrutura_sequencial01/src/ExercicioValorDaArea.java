import java.util.Scanner;
import java.util.Locale;

public class ExercicioValorDaArea {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		double raio,  pi = 3.14159;
		
		raio = sc.nextDouble();
		
		double area = Math.pow(raio, 2);
		
		double valorDaArea = pi * area;
		
		System.out.printf("Valor da área: %.4f " , valorDaArea);
		
		sc.close();
		
		

	}

}
