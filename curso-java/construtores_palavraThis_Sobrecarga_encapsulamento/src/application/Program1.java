package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product1;

public class Program1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in Stock: ");
		int quantity = sc.nextInt();
		
		Product1 product1 = new Product1(name, price, quantity);
		
		product1.setName("Computer"); // Chamando o metodo set para dar um novo valor para o atributo.
		System.out.println("Update name : " +  product1.getName()); // chamando o get para pegar o nome do atributo
		
		product1.setPrice(1200.00);
		System.out.println("Update price : " + product1.getPrice());
		
		// System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f. %n", product.name, product.price, product.quantity, product.totalValueInStock());
		System.out.println();
		System.out.print("Product data: " + product1); // chamando o metodo toString implementado na classe Product
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product1.addProduct(quantity);
		
		System.out.println();
		System.out.println("Update data " + product1);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product1.removeProduct(quantity);	
		
		System.out.println();
		System.out.println("Update data " + product1);
		
		sc.close();
	}

}
