
public class ManipulacaoString {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG ";
		
		String s01 = original.toLowerCase(); //String convertida em letras minúsculas
		String s02 = original.toUpperCase(); //String convertida em letras minúsculas
		String s03 = original.trim(); //elimina os espaços em brancos no começo e no fim.
		String s04 = original.substring(2); //começa com a string a partir da segunda casa, ou seja, elimina as duas primeira casa.
		String s05 = original.substring(2, 9); // recorta a string da casa 2 até a 9.
		String s06 = original.replace('a', 'x'); // sempre que encontrar "a" minusculo troca pelo "x".
		String s07 = original.replace("abc", "xy"); // replace também funciona para subString: sempre que encontrar "abc" minusculo troca pelo "xy".
		
		int i = original.indexOf("bc"); // qual a localização do bc na string.
		int j = original.lastIndexOf("bc"); // qual a localização do último bc na string.
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

	}

}
