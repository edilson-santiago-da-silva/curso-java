import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertingDatetimeToText {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); // data com manipulação de Texto formato ISO8601
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // data + hora com manipulação de texto para o formato ISO8601 
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // data + hora formato GMT, ou seja data universal de Londres.
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //Pega o fuso horário do computador do usuário e retorna a Hora Universal.
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; // instância o horário local para conversão da datatime padrão de londres.

		System.out.println("d04 = " + d04.format(fmt1)); //Conversão para Texto com parametro do objeto fmt1
		System.out.println("d04 = " + fmt1.format(d04)); //conversão para texto com parametro do objeto d04
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // iniciação de conversão direto na impressão, isso limita apenas a essa linha, não podendo ser reaproveitado no Programa. 
		System.out.println("------------------------");
		
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("------------------------");
		
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d06 = " + fmt5.format(d06));
		System.out.println("d06 = " + d06.toString());
		
		
		
		
	}

}
