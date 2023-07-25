package entitiesProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class UsedProduct extends ProductNational {
	private LocalDate manufactureDate;
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return getName() 
				+ " (used) $" 
				+ getPrice() 
				+ " (Manufature date: " 
				+ manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}
	
}
