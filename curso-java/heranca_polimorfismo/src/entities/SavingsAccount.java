package entities;

public class SavingsAccount extends Account {

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}

	// Sobreposição ou sobrescrita - É a implementação de um método de uma
	// superclasse na subclasse
	// É fortemente recomendável usar a anotação @Override em um método sobrescrito
	@Override
	public void withDraw(double amount) {
		balance -= amount;
	}

}
