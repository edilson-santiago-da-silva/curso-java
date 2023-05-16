import javax.swing.*;

public class Desco1 {

	public static void main(String[] args) {
		int n1, n2, soma = 0;
		char op = 0;
		String msg = "", msgEntr = "Digite 1 adicao:\nDigite 2 somatoria:";
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero inteiro:"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero inteiro:"));
		op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
		
		switch(op) {
			case '1': {
				soma = n1 + n2;
				msg += " Soma do " + n1 + " + " + n2 + " eh: " + soma;
				break;
			}
			case '2': {
				for(int i=1; i<=n2; i++) {
					soma += n1;
				}
				msg += " Soma de " + n1 + ", " + n2 + " vezes eh: " + soma;
				break;
			}
			default: JOptionPane.showMessageDialog(null, "Opcão invalida, calculos não realizados");
			}
			
			if (op >= '1' || op <= '2') {
				JOptionPane.showMessageDialog(null, msg);
			}
			
			System.exit(0);
	}

}
