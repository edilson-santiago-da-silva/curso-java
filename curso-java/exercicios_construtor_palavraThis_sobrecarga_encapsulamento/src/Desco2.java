import javax.swing.JOptionPane;

public class Desco2 {

	public static void main(String[] args) {
		int vetor[] = {2, 4, 6, 8, 10};
		int matriz[][] = new int [2][3];
		String msg = "vetor: ";
		
		//vetor = :
		for (int i = 0; i < vetor.length ; i++ ) {
			msg += vetor[i] + " ";
		}
		JOptionPane.showMessageDialog(null, msg);

		msg = "Matriz : \n";
		for (int i = 0; i < matriz.length ; i++) {
			for (int j = 0; j < matriz[0].length ; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro para posicao " + i + " e " + j));
				msg += matriz[i][j] + " ";
			}
			msg += "\n";
		}
		JOptionPane.showMessageDialog(null, msg);
		System.exit(0);
	}
}
