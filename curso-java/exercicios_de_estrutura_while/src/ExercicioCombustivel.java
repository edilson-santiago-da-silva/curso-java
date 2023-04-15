import java.util.Scanner;

public class ExercicioCombustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0, gasolina = 0, diesel = 0;
		double comb = sc.nextDouble();

		while (comb != 4) {
			if (comb == 1) {
				alcool += 1;
			} 
			else if (comb == 2) {
				gasolina += 1;
			} 
			else if (comb == 3) {
				diesel += 1;	
			} 
			comb = sc.nextDouble();
		}
		
		System.out.println("Alcool = " + alcool);
		System.out.println("Gasolina = " + gasolina);
		System.out.println("Diesel = " + diesel);
		
		sc.close();
	}

}
