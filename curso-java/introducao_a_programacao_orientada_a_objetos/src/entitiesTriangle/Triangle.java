package entitiesTriangle;

public class Triangle {
		
		public double a;
		public double b;
		public double c;
		
		public double area() { // Método com o calculo da area 
			double p = (a + b + c) / 2;
			return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		}
	}

