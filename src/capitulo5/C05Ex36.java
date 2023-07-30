package capitulo5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class C05Ex36 {

	public static void main(String[] args) {
		// Declaração de variáveis
		LocalDate data1;
		LocalDate data2;
		
		int dia1, mes1, ano1;
		int dia2, mes2, ano2;
		long diferenca;
		
		String edata1;
		String edata2;
		Scanner s = new Scanner(System.in);
		
		// Solicita a data inicial ao usuário e armazena na variável edata1
		System.out.println("\n\nData inicial (dd/mm/aaaa): ");
		edata1 = s.nextLine();
		
		// Solicita a data final ao usuário e armazena na variável edata2
		System.out.println("\n\nData final (dd/mm/aaaa): ");
		edata2 = s.nextLine();
		
		// Extrai dia, mês e ano da primeira data informada
		dia1 = Integer.parseInt(edata1.substring(0, 2));
		mes1 = Integer.parseInt(edata1.substring(3, 5)) - 1;
		ano1 = Integer.parseInt(edata1.substring(6, 10));
		
		// Cria o objeto LocalDate data1 utilizando os valores extraídos da primeira data
		data1 = LocalDate.of(ano1, mes1, dia1);
		
		// Extrai dia, mês e ano da segunda data informada
		dia2 = Integer.parseInt(edata2.substring(0, 2));
		mes2 = Integer.parseInt(edata2.substring(3, 5)) - 1;
		ano2 = Integer.parseInt(edata2.substring(6, 10));
		
		// Cria o objeto LocalDate data2 utilizando os valores extraídos da segunda data
		data2 = LocalDate.of(ano2, mes2, dia2);
		
		// Calcula a diferença em dias entre as duas datas usando o método between da classe ChronoUnit
		if (data1.compareTo(data2) > 0)
			diferenca = ChronoUnit.DAYS.between(data2, data1);
		else
			diferenca = ChronoUnit.DAYS.between(data1, data2);
		
		// Exibe o resultado da diferença de dias
		System.out.println("Diferença de dias: " + diferenca);
		
		// Fecha o Scanner para liberar recursos
		s.close();
	}

}
