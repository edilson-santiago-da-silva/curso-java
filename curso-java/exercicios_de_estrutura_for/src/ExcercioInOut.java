import java.util.Scanner;

public class ExcercioInOut {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int somaIn = 0;
		int somaOut = 0;
		for (int i = 0 ; i < n ; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				somaIn++ ;
			}
			else {
				somaOut++;
			}
		}
		
		System.out.println("---------------------------------");
		System.out.println(somaIn + " in");
		System.out.println(somaOut + " out");
		sc.close();

	}

}
