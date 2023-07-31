package entities;

public class Product1 {
	 String name; // ATRIBUTOS
	private double price;
	private int quantity;
	
	public Product1() { // CONSTRUTOR PADRÃO - SOBRECARGA 
	
	}
	
	public Product1(String name, double price, int quantity) { // CONSTRUTOR. Por convenção sempre a baixo dos atributos. Obriga o usuário a implementar os valores  obrigatórios que pode impactar negativamente o produto caso não seja implementado. Entre aspas está os parâmetros
		this.name = name; // palavra this. Faz a referenciação  ao atributo implementado.
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product1(String name, double price) { //CONSTRUTOR - SOBRECARGA. Onde criamos um construtor opcional com apenas o nome e preço. O atributo qtd recebeu zero, não a necessidade de declarar.
		this.name = name;
		this.price = price;
	}
	// Por convenção os métodos são adicionados depois dos construtores. 	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
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
