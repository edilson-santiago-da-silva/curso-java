import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Listas {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();

		list.add("Maria"); // add a String Maria no objeto list.
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2,"Marco"); // add na posição 2 o nome Marco.
		
		System.out.println(list.size()); // Tamanho da lista --> list.size();
		for(String x : list) { //For beach (Tipo primitivo - Apelido : Objeto)
			System.out.println(x);
		}
		System.out.println("--------------------------------------------------");
		//list.remove(1); // Remova na posição 1 a String dentro da Lista.
		list.removeIf(x -> x.charAt(0) == 'M'); // Predicato - remover todos da String x que na posição charAt(0) == 'M' --> Definição de função Lambida
		for(String x : list) { //For beach (Tipo primitivo - Apelido : Objeto)
			System.out.println(x);
		}
		System.out.println("--------------------------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob")); // Procure no objeto list o index de Bob e retorne a posição.
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // index inválido retorna -1.
		System.out.println("--------------------------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // Filtre os nomes com a letra A e add na nova lista result, Depois volte para o formato de lista atráves do collectors
		for(String x : result) { //For beach (Tipo primitivo - Apelido : Objeto)
			System.out.println(x);
		}
		System.out.println("--------------------------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); //findFirst --> Pega a primeira letra com a função lambida dentro do filter. orElse(null) --> retorna null caso o predicato não encontre.
		System.out.println(name);
		
		
	}

}
