
//salvar como Programa04.java
import javax.swing.*;

class Desco{
	public static void main(String entrada[]){
		int tabuada;
		char op = 0;
		String msg = "", msgEntr = "Digite 1 repeticao for:\nDigite 2 repeticao while:\nDigite 3 repeticao do/while:";

		tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:")); //entrada de dados
		op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
		
		switch(op) {
			case '1': {
				msg = msg + "Tabuada do " + tabuada + " Pelo for: \n\n";
				for(int i=1; i<=10; i=i+1) {
					msg = msg + tabuada + " x " + i + " = " + tabuada*i + "\n";
				}
				break;
			}
			
			case '2': {
				msg = msg + "Tabuada do " + tabuada + " Pelo while: \n\n";
				int i = 1;
				while(i<=10) {
					msg = msg + tabuada + " x " + i + " = " + tabuada*i + "\n";
					i = i + 1;
				}
				break;
			}
			case '3': {
				msg = msg + "Tabuada do " + tabuada + " Pelo do/while: \n\n";
				int i = 1;
				do {
					msg = msg + tabuada + " x " + i + " = " + tabuada*i + "\n";
					i = i + 1;
				} while(i<=10);
				break;
			}
		default: JOptionPane.showMessageDialog(null, "Opcão invalida, calculos não realizados");
		}
		
		if (op >= '1' || op <= '3') {
			JOptionPane.showMessageDialog(null, msg);
		}
		
		System.exit(0);
	}
}