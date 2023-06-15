package pensionato;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRooms { 	//if(vect[i] != null)

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		String name, email;
		int roomRented;
		PersonData[] data = new PersonData[10];
		
		for(int i=0; i<n; i++) {
			System.out.println("Rent #" + (i + 1));
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			roomRented = sc.nextInt();
			
			data[roomRented] = new PersonData(name, email);
			
			System.out.println();
		 }
		
		System.out.println("Busy Rooms:");
		for(int i=0; i<data.length; i++) {
			if(data[i] != null) {
				System.out.printf("%d: %s", i,  data[i]);
				System.out.println();
			}
		}
		
			
		
		
		sc.close();
	}

}
