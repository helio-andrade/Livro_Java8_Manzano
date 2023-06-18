package capitulo5;

import javax.swing.JOptionPane;

public class ConversorIPv4_v2 {
    public static void main(String[] args) {
        String ipv4Decimal = JOptionPane.showInputDialog("Digite o endereço IPv4 (Ex.: 192.167.1.5):");

        String ipv4Binario = converterIPv4ParaBinario(ipv4Decimal);
        JOptionPane.showMessageDialog(null, "Endereço IPv4 em binário: " + ipv4Binario);
    }

    private static String converterIPv4ParaBinario(String ipv4Decimal) {
        String[] octetos = ipv4Decimal.split("\\.");

        StringBuilder binario = new StringBuilder();

        for (String octeto : octetos) {
            int valorDecimal = Integer.parseInt(octeto);
            String valorBinario = Integer.toBinaryString(valorDecimal);

            // Adicionar zeros à esquerda, se necessário, para completar 8 bits
            String valorBinarioCompleto = String.format("%8s", valorBinario).replace(' ', '0');

            binario.append(valorBinarioCompleto).append(".");
        }

        // Remover o ponto extra no final
        binario.deleteCharAt(binario.length() - 1);

        return binario.toString();
    }
}
