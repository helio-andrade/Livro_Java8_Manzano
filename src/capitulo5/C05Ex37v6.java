package capitulo5;

import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class C05Ex37v6 {

    public static void main(String[] args) {
        // Exibe mensagem de cabeçalho
        JOptionPane.showMessageDialog(null, "*** Estacionamento 24 HORAS ***");

        // Solicita a data e hora de entrada ao usuário
        String entrada = JOptionPane.showInputDialog(
        		"Entrada [dd/MM/yyyy HH:mm:ss]: ");
        // Solicita a data e hora de saída ao usuário
        String saida = JOptionPane.showInputDialog(
        		"Saída [dd/MM/yyyy HH:mm:ss]: ");
        // Solicita o valor da hora de estacionamento ao usuário
        double valorHora = Double.parseDouble(
        		JOptionPane.showInputDialog("Valor Hora [R$]: "));

        // Calcula a fatura do estacionamento (tempo de permanência e valor total)
        Fatura fatura = calcularFatura(entrada, saida, valorHora);

        // Formatação para exibir o resultado com duas casas decimais
        DecimalFormat df = new DecimalFormat("0.00");

        // Exibe o tempo de permanência no estacionamento
        JOptionPane.showMessageDialog(null,
        		"Permanência: " + fatura.getPermanencia() + " minutos");

        // Exibe o valor a ser pago pelo estacionamento
        JOptionPane.showMessageDialog(null, 
        		"Valor a ser pago: R$ " + df.format(fatura.getValor()));
    }

    // Método para calcular a fatura do estacionamento
    private static Fatura calcularFatura(String entrada, String saida, double valorHora) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime inicio = LocalDateTime.parse(entrada, formatter);
        LocalDateTime fim = LocalDateTime.parse(saida, formatter);

        // Calcula o tempo de permanência no estacionamento em minutos
        Duration duracao = Duration.between(inicio, fim);
        long permanencia = duracao.toMinutes();

        // Calcula o valor total a ser pago pelo estacionamento
        double fracaoHora = valorHora / 60;
        double valorTotal = permanencia * fracaoHora;

        // Retorna a fatura contendo o tempo de permanência e o valor total
        return new Fatura(permanencia, valorTotal);
    }

    // Classe interna para representar a fatura do estacionamento
    private static class Fatura {
        private long permanencia; // Tempo de permanência em minutos
        private double valor;     // Valor total a ser pago

        public Fatura(long permanencia, double valor) {
            this.permanencia = permanencia;
            this.valor = valor;
        }

        public long getPermanencia() {
            return permanencia;
        }

        public double getValor() {
            return valor;
        }
    }
}
