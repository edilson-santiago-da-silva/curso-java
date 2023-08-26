package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountTry;
import exceptions.BusinessException;

public class ProgramAccountTry {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados da conta:");
		System.out.print("Número:");
		int number = sc.nextInt();
		System.out.print("Titular:");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo inicial:");
		double balance = sc.nextDouble();
		System.out.print("Limite de saque:");
		double withdrawLimit = sc.nextDouble();
		
		AccountTry acc = new AccountTry(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Informe uma quantia para sacar: ");
		double amount = sc.nextDouble();
		
		try {
			acc.withdraw(amount);
			System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
		
		

	}

}
