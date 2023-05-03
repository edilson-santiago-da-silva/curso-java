package entities;

public class Product1 {
	public String name; // atributos
	public double price;
	public int quantity;
	
	public Product1(String name, double price, int quantity) { // Construtor. Por convenção sempre a baixo dos atributos. Obriga o usuário a implementar os valores  obrigatórios que pode impactar negativamente o produto caso não seja implementado. Entre aspas está os parâmetros
		this.name = name; // palavra this. Faz a referenciação  ao atributo implementado.
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalValueInStock( ) {
		return price * quantity;
		
	}

	public void addProduct(int quantity) {
		this.quantity += quantity; // Ao se deparar com uma ambiguidade entre atributo e o argumento, devemos usar o this. sinalizando que estamos se referindo ao atributo.
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() { // como a classe Product assim como toString se trata de um OBJECT. Nesse metodo estou sobrepondo o product com  a operação toString que já vem por padrão. 
		return name 
			+ ", $" 
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, total: $ "
			+ String.format("%.2f", totalValueInStock());
	}
}
