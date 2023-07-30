package capitulo5;

import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class C05Ex37v5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe o cabeçalho do programa
        System.out.println("\n*** Estacionamento 24 HORAS ***\n\n");

        // Solicita a data e hora de entrada ao usuário
        System.out.println("Data e Hora de Entrada [dd/MM/yyyy HH:mm:ss]: ");
        String entradaDataHora = scanner.nextLine();

        // Solicita a data e hora de saída ao usuário
        System.out.println("Data e Hora de Saída [dd/MM/yyyy HH:mm:ss]: ");
        String saidaDataHora = scanner.nextLine();

        // Solicita o valor da hora de estacionamento ao usuário
        System.out.println("Valor da Hora [R$]: ");
        double valorHora = scanner.nextDouble();

        // Calcula a fatura do estacionamento (tempo de permanência e valor total)
        FaturaEstacionamento fatura = calcularFaturaEstacionamento(entradaDataHora, saidaDataHora, valorHora);

        // Exibe a fatura do estacionamento (tempo de permanência e valor total)
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Tempo de Permanência: " + fatura.getTempoPermanencia() + " minutos");
        System.out.println("Valor a ser pago: R$ " + df.format(fatura.getValorTotal()));

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }

    private static FaturaEstacionamento calcularFaturaEstacionamento(String entradaDataHora, String saidaDataHora, double valorHora) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime dataEntrada = LocalDateTime.parse(entradaDataHora, formatter);
        LocalDateTime dataSaida = LocalDateTime.parse(saidaDataHora, formatter);

        // Calcula o tempo de permanência no estacionamento
        Duration duracao = Duration.between(dataEntrada, dataSaida);
        long minutosPermanencia = duracao.toMinutes();

        // Calcula o valor total a ser pago pelo estacionamento
        double fracaoHora = valorHora / 60;
        double valorTotal = minutosPermanencia * fracaoHora;

        return new FaturaEstacionamento(minutosPermanencia, valorTotal);
    }

    private static class FaturaEstacionamento {
        private long tempoPermanencia;
        private double valorTotal;

        public FaturaEstacionamento(long tempoPermanencia, double valorTotal) {
            this.tempoPermanencia = tempoPermanencia;
            this.valorTotal = valorTotal;
        }

        public long getTempoPermanencia() {
            return tempoPermanencia;
        }

        public double getValorTotal() {
            return valorTotal;
        }
    }
}
