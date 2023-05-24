package hignerOld;

import java.util.Locale;
import java.util.Scanner;

public class ProgramHignerOld {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people are you going to type? ");
		int n = sc.nextInt();
		Person vect [] = new Person[n];
		
		String name, nameHigner = null;
		int age, higner = 0;
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.printf((i+1) + "st person data: %n" );
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Age: ");
			age = sc.nextInt();	
			
			vect[i] = new Person(name, age);
		}
		
		for(int i=0; i<n; i++) {
			if(i == 0) {
				higner = vect[i].getAge();
			}
			if(vect[i].getAge() > higner) {
				higner = vect[i].getAge();
				nameHigner = vect[i].getName();
			}
		}
		
		System.out.print("older person: " + nameHigner);

		
		sc.close();
	}

}
