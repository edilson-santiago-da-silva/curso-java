package entitiesStaticDolar;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double converter(double dollar, double amount){
		return dollar * amount * (1.0 + IOF);
	}
	
	
	
}
