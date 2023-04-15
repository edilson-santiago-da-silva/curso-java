import java.util.Scanner;

public class FuncoesSintaxe {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter three numbers:");
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int higher = max(a, b, c);
			
			showResult(higher);
			
			sc.close();
			
			}
	
			public static int max(int x, int y, int z) { // Criaçao da função Máx com os 3 paramêtros de entrad.

				int aux;
				
				if (x > y && x > z) {
					aux = x;
				}
				else if (y > z) {
					aux = y;
				}
				else {
					aux = z;
				}
				return aux; // retorno do maior número para reaproveitamento na função max.
			}
			
			public static void showResult(int value) { // quando a função faz uma ação sem retorno para ser reaproveitado pelo programa,  o tipo que ela retorna é void (vazio)
			System.out.println("Higher = " + value);

	}

}
