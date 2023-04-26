package entitiesStudent;

public class Student {
	public String name;
	public double note1;
	public double note2;
	public double note3;
	public double finalGrade;
	
	public double noteFinal() {
		return note1 + note2 + note3;
	}
}
