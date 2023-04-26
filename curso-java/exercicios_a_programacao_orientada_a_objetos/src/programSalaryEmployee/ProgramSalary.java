package programSalaryEmployee;

import java.util.Locale;
import java.util.Scanner;

import entitiesEmployee.Employee;

public class ProgramSalary {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.printf("Gross salary: ");
		employee.salary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f %n", employee.name, employee.netSalary());
		
		System.out.printf("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		
		System.out.printf("Update data: %s, $ %.2f ", employee.name, employee.netSalary());
		
		
		sc.close();
	}

}
