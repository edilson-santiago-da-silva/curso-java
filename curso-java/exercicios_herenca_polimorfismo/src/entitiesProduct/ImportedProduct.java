package entitiesProduct;

public class ImportedProduct extends ProductNational {
	
	private double customsFee;
	
	public ImportedProduct() {
		
	}

	public ImportedProduct(String name, Double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	
	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return getPrice() + customsFee;
	}

	@Override
	public String priceTag() {
		return getName() + " $ " + totalPrice() + " Customs fee: $" + customsFee;
	}
	
}
