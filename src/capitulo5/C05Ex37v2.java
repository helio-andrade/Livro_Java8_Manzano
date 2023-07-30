package capitulo5;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class C05Ex37v2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe o cabeçalho do programa
        System.out.println("\n*** Estacionamento 24 HORAS ***\n\n");

        // Solicita a data de entrada ao usuário
        System.out.println("Data de Entrada [dd/mm/aaaa]: ");
        String inputData1 = scanner.nextLine();

        // Solicita a hora de entrada ao usuário
        System.out.println("Hora de Entrada [hh:mm]: ");
        String inputHora1 = scanner.nextLine();

        // Solicita a data de saída ao usuário
        System.out.println("Data de Saída [dd/mm/aaaa]: ");
        String inputData2 = scanner.nextLine();

        // Solicita a hora de saída ao usuário
        System.out.println("Hora de Saída [hh:mm]: ");
        String inputHora2 = scanner.nextLine();

        // Solicita o valor da hora de estacionamento ao usuário
        System.out.println("Valor da Hora [R$]: ");
        double valorHora = scanner.nextDouble();

        LocalDateTime data1 = parseLocalDateTime(inputData1, inputHora1);
        LocalDateTime data2 = parseLocalDateTime(inputData2, inputHora2);

        // Calcula a fração da hora com base no valor da hora de estacionamento
        double fracaoHora = valorHora / 60;

        // Calcula o valor total a ser pago pelo estacionamento
        double valorTotal = Math.abs(ChronoUnit.SECONDS.between(data1, data2)) / 60 * fracaoHora;

        // Exibe o valor total a ser pago pelo estacionamento
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Valor a ser pago: R$ " + df.format(valorTotal));

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }

    private static LocalDateTime parseLocalDateTime(String dateStr, String timeStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return LocalDateTime.parse(dateStr + " " + timeStr, formatter);
    }
}
