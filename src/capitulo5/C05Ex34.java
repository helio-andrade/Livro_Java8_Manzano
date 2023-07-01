package capitulo5;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class C05Ex34 {
    public static void main(String[] args) {
        LocalDate dataSistema = LocalDate.of(1981, 2, 8); // Data específica: 08/02/1981
        DayOfWeek diaSemana = dataSistema.getDayOfWeek();
        int diaSemanaInt = diaSemana.getValue();
        int diasAno = dataSistema.getDayOfYear();

        System.out.println("Data específica .........: " + dataSistema);
        System.out.println("Dia da semana (extenso) .: " + diaSemana);
        System.out.println("Dia da semana (numero) ..: " + diaSemanaInt);
        System.out.println("Numero de dias no ano ...: " + diasAno);
        
    }
}
