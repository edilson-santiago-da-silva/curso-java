
public class ProcessamentoDeDadosECasting {

	public static void main(String[] args) {
		int x;
		double y;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(y);
		System.out.println("--------");
		
		double b, B, h, area; // AREA DE UM TRAPÉZIO
		b = 6.0; // 6f
		B = 8.0; // 8f - BOA PRÁTICA QUANDO AS VARIÁVEIS SÃO DO TIPO DOUBLE SMP O NÚMERO SEGUIDO DE PONTO E ZERO.
		h = 5.0; // 5f - CASO SEJA FLOAT USA f DEPOIS DO NÚMERO. EX. 10F
		area = (b + B) / 2.0 * h;
		System.out.println(area);
		System.out.println("--------");
		
		int a, c;
		double resultado;
		a = 5;
		c = 2;
		resultado = (double) a / c; // CASTING, CONVERSÃO EXPLÍCITA DOS VALORES.
		System.out.println(resultado); // É NECESSÁRIO QUANDO O COMPILADOR NÃO É CAPAZ DE “ADIVINHAR” QUE O RESULTADO DE UMA EXPRESSÃO DEVE SER DE OUTRO TIPO.
		System.out.println("--------");
		
		double w;
		int v;
		
		w = 5.0;
		v = (int) w; //casting
		
		System.out.println(v);
		
		
		
		
	}
	
}
