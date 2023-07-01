package capitulo5;

import java.time.LocalDateTime;

public class C05Ex33 {
	public static void main(String[] args) {
		
		LocalDateTime dataHora = LocalDateTime.now();
		int hora	= dataHora.getHour();
		int minuto	= dataHora.getMinute();
		int segundo = dataHora.getSecond();
		int nano	= dataHora.getNano();	// Pega o nanosegundo
		
		System.out.println("Data do sistema ...: " + dataHora);
		System.out.println("Hora ..............: " + hora);
		System.out.println("Minutos............: " + minuto);
		System.out.println("Segundos ..........: " + segundo);
		System.out.println("Nanosegundos ......: " + nano);
	}
}
