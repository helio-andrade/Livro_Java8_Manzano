package capitulo5;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class C05Ex37v5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe o cabeçalho do programa
        System.out.println("\n*** Estacionamento 24 HORAS ***\n");

        // Solicita a data e hora de entrada ao usuário
        System.out.println("Data e Hora de Entrada [dd/MM/yyyy HH:mm:ss]: ");
        String entradaDataHora = scanner.nextLine();

        // Solicita a data e hora de saída ao usuário
        System.out.println("Data e Hora de Saída [dd/MM/yyyy HH:mm:ss]: ");
        String saidaDataHora = scanner.nextLine();

        // Solicita o valor da hora de estacionamento ao usuário
        System.out.println("Valor da Hora [R$]: ");
        double valorHora = scanner.nextDouble();

        // Calcula o valor total a ser pago pelo estacionamento
        double valorTotal = calcularValorTotal(entradaDataHora, saidaDataHora, valorHora);

        // Exibe o valor total a ser pago pelo estacionamento
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Valor a ser pago: R$ " + df.format(valorTotal));

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }

    private static double calcularValorTotal(String entradaDataHora, String saidaDataHora, double valorHora) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime data1 = LocalDateTime.parse(entradaDataHora, formatter);
        LocalDateTime data2 = LocalDateTime.parse(saidaDataHora, formatter);

        double fracaoHora = valorHora / 60;

        return Math.abs(ChronoUnit.SECONDS.between(data1, data2)) / 60 * fracaoHora;
    }
}
