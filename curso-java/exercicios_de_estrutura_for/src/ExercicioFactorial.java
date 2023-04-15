import java.util.Scanner;

public class ExercicioFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int f = 1;	
		
		for (int i = n; i >=1; i--) {
			f = f * i;
				if (i == 1) {
					System.out.print( i + " = " );
				}
				else {
					System.out.print( i + " x " );
				}
		}
		System.out.println(f);
		sc.close();

	}

}