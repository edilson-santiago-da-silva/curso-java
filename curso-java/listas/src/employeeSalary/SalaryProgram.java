package employeeSalary;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class SalaryProgram {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<EmployeeEntities> list = new ArrayList<>();
		
		System.out.print("How many employees will be registred?");
		int n = sc.nextInt();

		
		for(int i=0; i<n; i++) {
			
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id:");
			int id = sc.nextInt();
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary:");
			double salary = sc.nextDouble();
			System.out.println();
			
			list.add(new EmployeeEntities(id, name, salary));
		}	
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		EmployeeEntities emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			Double pct = sc.nextDouble();
			emp.increaseSalary(pct);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for(EmployeeEntities obj : list) {
			System.out.println(obj);
		}
		
		sc.close();	
		
	}
	
}
