package capitulo5;

import java.time.LocalTime;

public class C05Ex32 {
	public static void main(String[] args) {
		
		LocalTime	horaSistema = LocalTime.now();		// Hora do sistema
		int 		hora = horaSistema.getHour();		// Pega apenas a hora
		int			minuto = horaSistema.getMinute();	// Pega apenas o minuto
		int			segundo = horaSistema.getSecond();	// Pega apenas o segundo
		
		System.out.println("\nHora ........: " + hora);
		System.out.println("Minutos .....: " + minuto);
		System.out.println("Segundos ....: " + segundo);
	}
}
