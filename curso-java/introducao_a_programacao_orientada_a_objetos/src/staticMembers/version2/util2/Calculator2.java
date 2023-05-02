package staticMembers.version2.util2;

public class Calculator2 {
	public  final double PI = 3.14159; // word Final is constant. once assigned cannot be modified.
	
	public  double circumference(double radius) {
		return 2.0 * PI * radius; // calculation of circumference 
	}
	
	public  double volume(double radius) {
		return 4.0 * PI * radius * radius / 3.0; // calculation of volume
	}
}

