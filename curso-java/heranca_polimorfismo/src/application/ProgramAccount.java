package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramAccount {

	public static void main(String[] args) {

		// SOBREPOSIÇÃO OU SOBRESCRITA
		// IMPLEMENTAÇÃO DE SOBREPOSIÇÃO NA CLASSE SavingAccount COM ANOTAÇÃO @Override.

		Account acc = new Account(1001, "Alex", 1000.0);
		acc.withDraw(200.0);
		System.out.println(acc.getBalance());

		Account acc1 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc1.withDraw(200.0);
		System.out.println(acc1.getBalance());

		// USANDO O METODO SUPER PARA SOBREPOSIÇÃO, CLASSE BusinessAccount.
		Account acc2 = new BusinessAccount(1003, "Bob", 1000.0, 1000.0);
		acc2.withDraw(200.0);
		System.out.println(acc2.getBalance());

		// UPCASTING - NESTE CASO É PEGAR UM OBJETO DO TIPO BusinessAccount(SUBCLASSE) E
		// ATRIBUIR A UMA VARIÁVEL DO TIPO Account(SUPERCLASSE).

		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING - NESTE CASO É PEGAR UM OBJETO DO TIPO Account(SUPERCLASSE) E
		// ATRIBUIR A UMA VARIÁVEL DO TIPO BusinessAccount(SUBCLASSE).

		BusinessAccount acc4 = (BusinessAccount) acc2; // (BusinessAcoount): é uma necessidade de forçar a conversão,
														// porque o compilador tem suas dúvidas sobre o conteúdo da
														// BusinessAcount.
		acc4.loan(100.0);

		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}

		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");

		}
		
		//POLIMORFSMO - É UM RECURSO QUE PERMITE QUE VARIÁVEIS DE UM MESMO TIPO, POSSAM APONTAR PARA OBJETOS DE TIPO ESPECÍFICOS DIFERENTES.
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withDraw(50.0);
		y.withDraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());

	}
}
