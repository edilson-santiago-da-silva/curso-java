package applicationTriangle;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class ExercicioComOrientacaoAObjetos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;  // Criação das variáveis do tipo Triangle orientado da classe entities(entidades)
		x = new Triangle(); // criação do objeto -- Instanciação (alocação dinâmica de memória)
		y = new Triangle(); // criação do objeto 
		
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area(); // chamando o método a partir da classe Triangle que vai calcular a area dos triangulos x e y
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f %n", areaX);
		System.out.printf("Triangle Y area: %.4f %n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		sc.close();


	}

}
