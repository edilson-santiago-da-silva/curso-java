package entities;

import java.util.Date;

public class Order {
	private Date date;
	private Product1 product1;
	
	
	public Order(Date date, Product1 product1) {
		super();
		this.date = date;
		this.product1 = product1;
		this.product1.name = "TV";
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Product1 getProduct() {
		return product1;
	}


	public void setProduct(Product1 product1) {
		this.product1 = product1;
	}
	
	
	
}

	

