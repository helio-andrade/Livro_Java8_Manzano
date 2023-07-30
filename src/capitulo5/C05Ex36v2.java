package capitulo5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class C05Ex36v2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a data inicial ao usuário
        System.out.println("\n\nData inicial (dd/mm/aaaa): ");
        String inputData1 = scanner.nextLine();

        // Solicita a data final ao usuário
        System.out.println("\n\nData final (dd/mm/aaaa): ");
        String inputData2 = scanner.nextLine();

        // Converte as strings de data em objetos LocalDate utilizando o método parseLocalDate
        LocalDate data1 = parseLocalDate(inputData1);
        LocalDate data2 = parseLocalDate(inputData2);

        // Calcula a diferença em dias entre as duas datas
        long diferenca = Math.abs(ChronoUnit.DAYS.between(data1, data2));

        // Exibe o resultado da diferença de dias
        System.out.println("Diferença de dias: " + diferenca);

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }

    // Método para converter uma string de data no formato "dd/MM/yyyy" em um objeto LocalDate
    private static LocalDate parseLocalDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dateStr, formatter);
    }
    

}
