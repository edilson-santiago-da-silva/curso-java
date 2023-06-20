
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstantiationDateTime {

	public static void main(String[] args) {

		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();  // Data Local
		LocalDateTime d02 = LocalDateTime.now(); // Data local + hora
		Instant d03 = Instant.now(); // Data local universal GMT/UTC - Londres
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); // data com manipulação de Texto formato ISO8601
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // data + hora com manipulação de texto para o formato ISO8601 
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // data + hora formato GMT, ou seja data universal de Londres.
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); // data + hora GMT com fuso de são paulo.  São Paulo: GMT-3
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); // Texto formato customizado -> Usando o dateTimeFormatter como parâmetro para passar o padrão para customização.
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

		LocalDate d10 = LocalDate.of(2022, 07, 20); //  dia, mês, ano, [horário] ➞ Data-hora local
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
	}
}