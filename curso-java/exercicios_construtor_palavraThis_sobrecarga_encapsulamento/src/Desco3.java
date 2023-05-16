import javax.swing.JOptionPane;

public class Desco3 {
	
	public static void soma() {
		int n1, n2;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero p/ soma: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero p/ soma: "));
		
		JOptionPane.showMessageDialog(null, "Soma dos dois numeros eh " + (n1+n2));
	}
	
	public static void subtracao(int x, int y) {
		int s;
		
		s = x - y;
		
		JOptionPane.showMessageDialog(null, "A diferenca da subtracao eh" + s);
	}
	
	public static int mult() {
		int n1, n2;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero p/ mult e div : ")); 
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero p/ mult e div: "));
		
		return (n1 * n2);
	}
	
	public static double divisao(int x, int y) {
		int d;
		
		d = x / y;
		
		return d;
		
	}

	public static void main(String[] args) {
		int n1, n2, s;
		double r;
		
		soma();
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero p/ sub:"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero p/ sub:"));
		subtracao(n1,n2);
		s = mult();
		JOptionPane.showMessageDialog(null, "a multiplicacao eh "+ s);
		r = divisao(n1, n2);
		JOptionPane.showMessageDialog(null, "A divisao eh "+ r);
		System.exit(0);
	}
}
