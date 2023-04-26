package programNoteStudent;

import java.util.Locale;
import java.util.Scanner;

import entitiesStudent.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Student student = new Student();
		
		Scanner sc = new Scanner(System.in);
		
		student.name = sc.nextLine();
		student.note1 = sc.nextInt();
		student.note2 = sc.nextInt();
		student.note3 = sc.nextInt();
		
		if(student.noteFinal() > 60) {
			System.out.println("FINAL GRADE = " + student.noteFinal());
			System.out.println("PASS");
		}
		else {
			System.out.println("FINAL GRADE = " + student.noteFinal());
			System.out.printf("FAILED %nMISSING %.2f Points", 60 - student.noteFinal());
		}
		
		
		sc.close();
	}

}
