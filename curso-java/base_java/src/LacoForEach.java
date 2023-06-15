
public class LacoForEach {

	public static void main(String[] args) {
		
		String [] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i=0; i < vect.length; i++ ) {
			System.out.println(vect[i]);
		}
		
		System.out.println("---------------------------------------"); // Estrutura for Each ---> for (Tipo Apelido : coleção) {
		//																								 <comandos> 			}
		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
