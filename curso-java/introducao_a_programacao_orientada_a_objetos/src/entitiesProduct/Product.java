package entitiesProduct;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock( ) {
		return price * quantity;
		
	}

	public void addProduct(int quantity) {
		this.quantity += quantity; // Ao se deparar com uma ambiguidade entre atributo e o argumento, devemos usar o this. sinalizando que estamos se referindo ao atributo.
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() { // como a classe ProductNational assim como toString se trata de um OBJECT. Nesse metodo estou sobrepondo o product com  a operação toString que já vem por padrão. 
		return name 
			+ ", $" 
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
