package capitulo5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class C05Ex35 {
	public static void main(String[] args) {
		LocalDate  data = LocalDate.of(1981, Month.FEBRUARY, 26);
		DayOfWeek  diaDaSemana = data.getDayOfWeek();
		int		   dia = diaDaSemana.getValue();
		int		   diasDoAno = data.getDayOfYear();
		
		System.out.println("Data especifica ............: " + data);
		System.out.println("Dia da semana (extenso) ....: " + diaDaSemana);
		System.out.println("Dia da semana (numero) .....: " + dia);
		System.out.println("Numero de dias do ano .......: " + diasDoAno); 
	}
}
