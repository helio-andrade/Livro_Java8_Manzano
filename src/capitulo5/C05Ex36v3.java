package capitulo5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class C05Ex36v3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a data inicial ao usuário
        System.out.println("\n\nData inicial (dd/mm/aaaa): ");
        String inputData1 = scanner.nextLine();

        // Solicita a data final ao usuário
        System.out.println("\n\nData final (dd/mm/aaaa): ");
        String inputData2 = scanner.nextLine();

        // Cria um DateTimeFormatter para interpretar as datas no formato "dd/MM/yyyy"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Converte as strings de data em objetos LocalDate utilizando o DateTimeFormatter
        LocalDate data1 = LocalDate.parse(inputData1, formatter);
        LocalDate data2 = LocalDate.parse(inputData2, formatter);

        // Calcula a diferença em dias entre as duas datas
        long diferenca = Math.abs(ChronoUnit.DAYS.between(data1, data2));

        // Exibe o resultado
        System.out.println("Diferença de dias: " + diferenca);

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
