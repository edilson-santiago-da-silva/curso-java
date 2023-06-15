import java.util.Scanner;

public class ProgramTwoNumberForMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][] mat = new int [n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Print Matriz:");
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("Check the number:");
		int x = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(mat[i][j] == x) {
					
					System.out.println(i+1 + "° locale - position " + i + "," + j +":" ); // Para consultar a posição dos dados da matriz, use a incrementação do laço.
					if(j>0) {
						System.out.println("left:" + mat[i][j-1]);
					}
					if(i>0) {
						System.out.println("Up:" + mat[i-1][j]);
					}  
					if (j < mat[i].length-1) {
						System.out.print("ref number --");
						System.out.println(mat[i].length-1);
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.print("ref number -- ");
						System.out.println(mat.length-1);
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			 }
		}
		sc.close();
	}

}
