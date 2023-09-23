package capitulo6;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.text.DecimalFormat;
import net.guiatech.livro.java.FinanMax;

public class C06Ex06a12v2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");

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
                    		JOptionPane.showInputDialog("Informe a taxa de juros: "));
                    double fv = Double.parseDouble(
                    		JOptionPane.showInputDialog("Informe o valor futuro: "));
                    double pv = Double.parseDouble(
                    		JOptionPane.showInputDialog("Informe o valor presente: "));
                    double cterm = FinanMax.cterm(i/12, fv, pv) / 12;
                    JOptionPane.showMessageDialog(null, 
                    		"Termo Composto: " + df.format(cterm));
                    break;

                case 2:
                    double pmt = Double.parseDouble(
                    		JOptionPane.showInputDialog("Informe o pagamento: "));
                    double j = Double.parseDouble(
                    		JOptionPane.showInputDialog("Informe a taxa de juros: "));
                    double n = Double.parseDouble(
                    		JOptionPane.showInputDialog("Informe o número de períodos: "));
                    float tipo = Float.parseFloat(
                    		JOptionPane.showInputDialog("Informe o tipo (1 ou 0): "));
                    double fvResult = FinanMax.fv(pmt, j, n, tipo);
                    JOptionPane.showMessageDialog(null, 
                    		"Valor Futuro: " + df.format(fvResult));
                    break;

                case 3:
                    double pvValue = Double.parseDouble(
                    		JOptionPane.showInputDialog("Informe o valor presente: "));
                    double interestRate = Double.parseDouble(
                    		JOptionPane.showInputDialog("Informe a taxa de juros: "));
                    double periods = Double.parseDouble(
                    		JOptionPane.showInputDialog("Informe o número de períodos: "));
                    float paymentType = Float.parseFloat(
                    		JOptionPane.showInputDialog("Informe o tipo (1 ou 0): "));
                    double paymentResult = FinanMax.pmt(pvValue, interestRate, periods, paymentType);
                    JOptionPane.showMessageDialog(null, 
                    		"Pagamento: " + df.format(paymentResult));
                    break;

                case 4:
                    double payment = Double.parseDouble(
                    		JOptionPane.showInputDialog("Informe o pagamento: "));
                    double rate = Double.parseDouble(
                    		JOptionPane.showInputDialog("Informe a taxa de juros: "));
                    double numPeriods = Double.parseDouble(
                    		JOptionPane.showInputDialog("Informe o número de períodos: "));
                    float type = Float.parseFloat(
                    		JOptionPane.showInputDialog("Informe o tipo (1 ou 0): "));
                    double pvResult = FinanMax.pv(payment, rate, numPeriods, type);
                    JOptionPane.showMessageDialog(null, 
                    		"Valor Presente: " + df.format(pvResult));
                    break;

                case 5:
                    double futureVal = Double.parseDouble(
                    		JOptionPane.showInputDialog("Informe o valor futuro: "));
                    double presentVal = Double.parseDouble(
                    		JOptionPane.showInputDialog("Informe o valor presente: "));
                    double numPeriod = Double.parseDouble(
                    		JOptionPane.showInputDialog("Informe o número de períodos: "));
                    float period = Float.parseFloat(
                    		JOptionPane.showInputDialog("Informe o período (1 ou 0): "));
                    double rateResult = FinanMax.rate(futureVal, presentVal, numPeriod, period);
                    JOptionPane.showMessageDialog(null, 
                    		"Taxa de Juros: " + df.format(rateResult));
                    break;

                case 6:
                    double paymentValue = Double.parseDouble(
                    		JOptionPane.showInputDialog("Informe o pagamento: "));
                    double intRate = Double.parseDouble(
                    		JOptionPane.showInputDialog("Informe a taxa de juros: "));
                    double futureValue = Double.parseDouble(
                    		JOptionPane.showInputDialog("Informe o valor futuro: "));
                    double termResult = FinanMax.term(paymentValue, intRate, futureValue);
                    JOptionPane.showMessageDialog(null, 
                    		"Número de Períodos: " + df.format(termResult));
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
