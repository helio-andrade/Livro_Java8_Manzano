package capitulo5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class C05Ex31 {

	public static void main(String[] args) {
		LocalDate	dataSistema	= LocalDate.now();				// Data do sistema
		DayOfWeek	diaSemana	= dataSistema.getDayOfWeek();	// Dia da semana
		int			diaMes 		= dataSistema.getDayOfMonth();	// Dia do mes
		Month		mes 		= dataSistema.getMonth();		// Mês do ano
		int			numeroMes	= dataSistema.getMonthValue();	// Número do mês
		int			ano			= dataSistema.getYear();		// Ano corrente
		int			diasAno		= dataSistema.getDayOfYear();	// Numero de dias do ano
		
		System.out.println("\nData do Sistema ..........: " + dataSistema);	
		System.out.println("Dia da Semana ............: " + diaSemana);		
		System.out.println("Dia do mes ...............: " + diaMes);
		System.out.println("Mes ......................: " + mes);
		System.out.println("Numero do mes ............: " + numeroMes);
		System.out.println("Ano ......................: " + ano);
		System.out.println("Numero de dias no ano ....: " + diasAno);
		
	}
}
