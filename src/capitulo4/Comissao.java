package capitulo4;
import javax.swing.JOptionPane;

class Comissao {
    private static final int NUM_CORRETORES = 3;
    private static final float COMISSAO_BAIXA = 0.07f;
    private static final float COMISSAO_MEDIA = 0.095f;
    private static final float COMISSAO_ALTA = 0.12f;

    public static void main(String[] args) {
        String relatorio = "Relatorio de Vendas";

        for (int i = 1; i <= NUM_CORRETORES; i++) {
            String nomeDoCorretor = JOptionPane.showInputDialog(
                    "Digite o nome do CORRETOR n. " + i);

            float valorDaVenda = Float.parseFloat(
                    JOptionPane.showInputDialog("Valor da Venda (R$)"));

            float comissao = calcularComissao(valorDaVenda);

            relatorio = relatorio + "\n\nNome: " + nomeDoCorretor +
                    "\nValor da Venda: R$ " + valorDaVenda +
                    "\nComissao: R$ " + comissao;
        }

        JOptionPane.showMessageDialog(null, relatorio);
    }

    private static float calcularComissao(float valorDaVenda) {
        if (valorDaVenda < 30000) {
            return COMISSAO_BAIXA * valorDaVenda;
        } else if (valorDaVenda <= 50000) {
            return COMISSAO_MEDIA * valorDaVenda;
        } else {
            return COMISSAO_ALTA * valorDaVenda;
        }
    }
}
