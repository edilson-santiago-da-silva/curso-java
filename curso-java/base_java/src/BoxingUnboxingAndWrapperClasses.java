
public class BoxingUnboxingAndWrapperClasses {

	public static void main(String[] args) {
		int x = 20;
		
		Object obj = x; // Boxing(encaixotamento) é o processo de conversão de um objeto tipo valor para um objeto tipo referência compatível
		
		System.out.println(obj);
		
		int y = (int) obj; // Unboxing(desencaixotando) é o processo de conversão de um objeto tipo valor para um objeto tipo referência compatível.

		System.out.println(y);
		
		
		
		int w = 20;
		
		Integer objt = w; // Uso comum: campos de entidades em sistemas de informação (IMPORTANTE!)
		
		System.out.println(objt); //  Pois tipos referência (classes) aceitam valor null e usufruem dos recursos OO.
		
		int m = objt * 2; // Você não precisa implementar o switch Case como no exemplo acima.
		
		System.out.println(m);
		
		// Integer x = 10;
		// int y = x * 2;
		//------------------------------
		// public class ProductNational {
		// public String name;
		// public Double price;  -----> mais informaçãoes no pdf 10 pag.20 - google drive
		// public Integer quantity;
		
		
		
	}

}
