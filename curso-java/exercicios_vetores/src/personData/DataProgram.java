package personData;

import java.util.Locale;
import java.util.Scanner;

public class DataProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("how many people will be entered:");
		int n = sc.nextInt();
		double height, shorterHeight = 0, greaterHeight = 0, sum = 0, avgF = 0, nF = 0, nM = 0 ;
		char gender;
		
		Data vect[] = new Data[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			height = sc.nextDouble();
			gender = sc.next().charAt(0);
			
			vect[i] = new Data(height, gender);					
		}
		
		for(int i=0; i<n; i++) {
			if(i == 0) {
				shorterHeight = vect[i].getHeight();
				greaterHeight = vect[i].getHeight();
			}
			
			if(vect[i].getHeight() < shorterHeight) {
				shorterHeight = vect[i].getHeight();
			}
			
			if(vect[i].getHeight() > greaterHeight) {
				greaterHeight = vect[i].getHeight();
			}
			
			if(vect[i].getGender() == 'f') {
				sum += vect[i].getHeight();
				nF += 1;
			}
			
			if(vect[i].getGender() == 'm') {
				nM += 1;
			}
			
		}
		
		avgF = sum/nF;
		
		System.out.println(" - " + shorterHeight);
		System.out.println(" + " + greaterHeight);
		System.out.printf("Avarege height of women: %.2f %n", avgF);
		System.out.println("number of men: " + nM);
		
		
	
		
		sc.close();
	}

}
