
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCalculations {

	public static void main(String[] args) {
		// Datas e hora são imutáveis, sempre que precisar fazer cálculos devesse criar objetos apartir da data e hora..
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); //Instanciação do dia e hora da máquina local 
		
		LocalDate pastWeekDate = d04.minusDays(7); // Calculo de subtração de dias de LocalDate.
		LocalDate nextWeekDate = d04.plusDays(7); // Calculo de adição de dias de LocalDate.
		
		LocalDateTime pastWeekLocalDate = d05.minusDays(7); //Cálculo de subtração de dias de LocalDateTime.
		LocalDateTime nextWeekLocalDate = d05.plusDays(7); //Cálculo de adição de dias de LocalDateTime.
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);//Cálculo de subtração de dias de Instant passando como parâmetro o VALOR e o CRITÉRIO da data.. 
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS); //Cálculo de adição             ''                 ''
		
		System.out.println("pastWeekDate = " + pastWeekDate);
		System.out.println("nextWeekDate = " + nextWeekDate);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay()); // Cálculo de duração entre dois Valores (objetos do tipo date.)
		Duration t2 = Duration.between(pastWeekLocalDate, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);

		System.out.println("t1 dias = " + t1.toDays()); // Impressão com OBJETO de duração especificando o MÉTODO.
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	}
}