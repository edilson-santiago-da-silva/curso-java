package entitiesEmployee;

public class Employee {
	public String name;
	public double salary;
	public double tax;
	double percentage;
	
	public double netSalary() {
		return salary - tax;
	}
	
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100;
	}
	
	
}
