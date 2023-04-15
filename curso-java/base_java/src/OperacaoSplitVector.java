
public class OperacaoSplitVector {

	public static void main(String[] args) {
		String s = "potato apple lemon";
		String[] vect = s.split(" "); // Separa as letras, cujo a identificação de separamento é o espaço. 
		String word1 = vect[0]; // vector são espaços na memória começando com zero representado por números 
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);

	}

}
