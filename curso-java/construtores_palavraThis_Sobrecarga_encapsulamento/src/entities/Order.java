package entities;

import java.util.Date;

public class Order {
	private Date date;
	private Product1 product1;
	
	
	public Order(Date date, Product1 product1) { //Construtor criado atráves do eclipse. > botao direito - source - generate constructor using fields
		super();
		this.date = date;
		this.product1 = product1;
		this.product1.name = "TV";
	}


	public Date getDate() { // Getters e setters criado atraves do eclipse. > botao direito - source - generate getters and setters
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

	

