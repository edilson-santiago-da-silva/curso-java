package bankProgram;

import java.util.Locale;
import java.util.Scanner;

import bankAccount.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit(y/n)?");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositInitial = sc.nextDouble();
			acc = new Account(number, holder, depositInitial);
		}
		else {
			acc = new Account(number, holder);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.printf(acc + "%n" + "%n");
		
		System.out.print("Enter a Deposit value: ");
		double deposit = sc.nextDouble();
		acc.deposit(deposit);
		System.out.println("Update account data:");
		System.out.printf(acc + "%n" + "%n");
		
		System.out.print("Enter a Withdraw value:"); 
		double withdraw = sc.nextDouble();
		acc.withdraw(withdraw);
		System.out.println("Update account data:");
		System.out.print(acc);
		
		sc.close();
	}

}
