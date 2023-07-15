package entities2;



public class OrderItem {
	private Integer quantity;
	private Double price;
	
	private Product product;
	
	public OrderItem(){
		
	}

	public OrderItem(Integer quatity, Double price, Product product) {
		this.quantity = quatity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuatity() {
		return quantity;
	}

	public void setQuatity(Integer quatity) {
		this.quantity = quatity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double subTotal() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return product.getName()
				+ ", "
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity +
				", SubTotal: $"
				+ String.format("%.2f", subTotal() );
	}

	
	
	
	
	
}
