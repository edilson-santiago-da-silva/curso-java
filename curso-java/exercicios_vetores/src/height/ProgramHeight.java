package height;

import java.util.Locale;
import java.util.Scanner;

public class ProgramHeight {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Number of people typed:");
		int n = sc.nextInt();
		DataPerson[] vect = new DataPerson[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Data, " + (i + 1) + "° Person: ");
			System.out.print("name: ");
			String name = sc.nextLine();
			System.out.print("age: ");
			int age = sc.nextInt();
			System.out.print("height: ");
			double height = sc.nextDouble();
			
			vect[i] = new DataPerson(name, age, height);
			
		}
		
		double sum = 0.0;
		for(int i=0; i<n; i++) {
			sum += vect[i].getHeight();
		}
		double avg = sum/n;
		System.out.printf("Height average: %.2f %n", avg);
		 
		int c = 0;
		for(int i=0; i<n; i++) {
			if(vect[i].getAge() < 16) {
				c += 1;
			}
		}
		System.out.println(c);
		
		double p = c*100/ n;
		System.out.printf("Percentage of people under 16 years old: %.2f%% \n", p);
		
		System.out.printf("people under 16 years old: %n");
		for(int i=0; i<n; i++)	{
			if(vect[i].getAge() < 16) {
			System.out.println(vect[i].getName());
			}
		}
		sc.close();
	}

}
