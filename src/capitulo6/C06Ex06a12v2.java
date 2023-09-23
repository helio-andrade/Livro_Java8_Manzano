package capitulo6;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import net.guiatech.livro.java.FinanMax;

public class C06Ex06a12v2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        int opcao;

        do {
            String input = JOptionPane.showInputDialog(
                "Escolha uma opção:\n" +
                "1. Calcular Termo Composto\n" +
                "2. Calcular Valor Futuro\n" +
                "3. Calcular Pagamento\n" +
                "4. Calcular Valor Presente\n" +
                "5. Calcular Taxa de Juros\n" +
                "6. Calcular Número de Períodos\n" +
                "0. Sair\n" +
                "Opção: "
            );

            opcao = Integer.parseInt(input);

            switch (opcao) {
                case 1:
                    double i = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Taxa de juros (mensal): "));
                    double fv = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Valor futuro: "));
                    double pv = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Valor presente: "));
                    double cterm = FinanMax.cterm(i / 12, fv, pv) / 12;
                    JOptionPane.showMessageDialog(null,
                            "Termo Composto: " + df.format(cterm) + " anos");
                    break;

                case 2:
                    double pmt = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Pagamento: "));
                    double j = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Taxa de juros (mensal): "));
                    double n = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Número de períodos: "));
                    float tipo = Float.parseFloat(
                            JOptionPane.showInputDialog(
                                    "Tipo (1 para adiantado, 0 para vencido): "));
                    double fvResult = FinanMax.fv(pmt, j, n, tipo);
                    JOptionPane.showMessageDialog(null,
                            "Valor Futuro: " + currencyFormat.format(fvResult));
                    break;

                case 3:
                    double pvValue = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Valor presente: "));
                    double interestRate = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Taxa de juros (mensal): "));
                    double periods = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Número de períodos: "));
                    float paymentType = Float.parseFloat(
                            JOptionPane.showInputDialog(
                                    "Tipo (1 para adiantado, 0 para vencido): "));
                    double paymentResult = FinanMax.pmt(pvValue, interestRate/12
                    		
                    		, periods, paymentType);
                    JOptionPane.showMessageDialog(null,
                            "Pagamento: " + currencyFormat.format(paymentResult));
                    break;

                case 4:
                    double payment = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Pagamento: "));
                    double rate = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Taxa de juros (mensal): "));
                    double numPeriods = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Número de períodos: "));
                    float type = Float.parseFloat(
                            JOptionPane.showInputDialog(
                                    "Tipo (1 para adiantado, 0 para vencido): "));
                    double pvResult = FinanMax.pv(payment, rate, numPeriods, type);
                    JOptionPane.showMessageDialog(null,
                            "Valor Presente: " + currencyFormat.format(pvResult));
                    break;

                case 5:
                    double futureVal = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Valor futuro: "));
                    double presentVal = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Valor presente: "));
                    double numPeriod = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Número de períodos: "));
                    float period = Float.parseFloat(
                            JOptionPane.showInputDialog(
                                    "Período (1 para adiantado, 0 para vencido): "));
                    double rateResult = FinanMax.rate(futureVal, presentVal, numPeriod, period);
                    JOptionPane.showMessageDialog(null,
                            "Taxa de Juros: " + df.format(rateResult) + "%");
                    break;

                case 6:
                    double paymentValue = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Pagamento: "));
                    double intRate = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Taxa de juros (mensal): "));
                    double futureValue = Double.parseDouble(
                            JOptionPane.showInputDialog(
                                    "Valor futuro: "));
                    double termResult = FinanMax.term(paymentValue, intRate, futureValue);
                    JOptionPane.showMessageDialog(null,
                            "Número de Períodos: " + df.format(termResult) + " anos");
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null,
                            "Encerrando o programa.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                            "Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }
}

