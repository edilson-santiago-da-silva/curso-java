package approved;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudents {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("how many stundents will be entered:");
		int n = sc.nextInt();
		String name;
		double note1, note2, sum, avg;
		
		Students vect[] = new Students[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.print((i+1) + " Student's name: ");
			name = sc.nextLine();
			System.out.print("1° Note: ");
			note1 = sc.nextDouble();
			System.out.print("2° Note: ");
			note2 = sc.nextDouble();
			
			vect[i] = new Students(name, note1, note2);
			
			System.out.println();
		}
		
		System.out.println("Students Approved:");
		for(int i=0; i<n; i++) {
			sum = vect[i].getNote1() + vect[i].getNote2();
			avg = sum / 2;
			
			if(avg >= 6) {
				System.out.println(vect[i].getName());
			}
			
		}
		sc.close();
	}

}
