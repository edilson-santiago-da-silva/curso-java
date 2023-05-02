package staticMembers.version3.util3;

public class Calculator3 {
	public static  final double PI = 3.14159; // word Final is constant. once assigned cannot be modified.
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius; // calculation of circumference 
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius / 3.0; // calculation of volume
	}
}
