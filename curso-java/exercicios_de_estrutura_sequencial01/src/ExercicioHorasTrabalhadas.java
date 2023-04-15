import java.util.Scanner;
import java.util.Locale;

public class ExercicioHorasTrabalhadas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		float hrt, vhr, s;
		
		n = sc.nextInt();
		hrt = sc.nextFloat();
		vhr = sc.nextFloat();
		
		s = hrt * vhr;
		
		System.out.println("NUMBER: " + n);
		System.out.printf("SALARY: U$ %.2f ", s);
		
		sc.close();
		
	}

}
