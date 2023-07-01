package capitulo5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class C05Ex34 {
    public static void main(String[] args) {

        LocalDate dataSistema = LocalDate.of(1981, 2, 8); // Data específica: 08/02/1981
        DayOfWeek diaSemana = dataSistema.getDayOfWeek();
        int diaSemanaInt = dataSistema.getDayOfWeek().getValue();
        int diasAno = dataSistema.getDayOfYear();

        String mensagem = "Data específica: " + dataSistema +
                "\nDia da semana (extenso): " + diaSemana +
                "\nDia da semana (numero): " + diaSemanaInt +
                "\nNúmero de dias no ano: " + diasAno;

        JOptionPane.showMessageDialog(null, mensagem, "Informações de Data", JOptionPane.INFORMATION_MESSAGE);
    }
}
