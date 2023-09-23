package capitulo6;

import java.util.Scanner;
import java.text.DecimalFormat;
import net.guiatech.livro.java.FinanMax;

public class C06Ex06a12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        int opcao;

        do {
        	System.out.println("Escolha uma opção:\n" +
                    "1. Calcular Termo Composto\n" +
                    "2. Calcular Valor Futuro\n" +
                    "3. Calcular Pagamento\n" +
                    "4. Calcular Valor Presente\n" +
                    "5. Calcular Taxa de Juros\n" +
                    "6. Calcular Número de Períodos\n" +
                    "0. Sair\n" +
                    "Opção: ");
        	opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe a taxa de juros: ");
                    double i = scanner.nextDouble();
                    System.out.print("Informe o valor futuro: ");
                    double fv = scanner.nextDouble();
                    System.out.print("Informe o valor presente: ");
                    double pv = scanner.nextDouble();
                    double cterm = FinanMax.cterm(i, fv, pv);
                    System.out.println("Termo Composto: " + df.format(cterm));
                    break;

                case 2:
                    System.out.print("Informe o pagamento: ");
                    double pmt = scanner.nextDouble();
                    System.out.print("Informe a taxa de juros: ");
                    double j = scanner.nextDouble();
                    System.out.print("Informe o número de períodos: ");
                    double n = scanner.nextDouble();
                    System.out.print("Informe o tipo (1 ou 0): ");
                    float tipo = scanner.nextFloat();
                    double fvResult = FinanMax.fv(pmt, j, n, tipo);
                    System.out.println("Valor Futuro: " + df.format(fvResult));
                    break;

                case 3:
                    System.out.print("Informe o valor presente: ");
                    double pvValue = scanner.nextDouble();
                    System.out.print("Informe a taxa de juros: ");
                    double interestRate = scanner.nextDouble();
                    System.out.print("Informe o número de períodos: ");
                    double periods = scanner.nextDouble();
                    System.out.print("Informe o tipo (1 ou 0): ");
                    float paymentType = scanner.nextFloat();
                    double paymentResult = FinanMax.pmt(pvValue, interestRate, periods, paymentType);
                    System.out.println("Pagamento: " + df.format(paymentResult));
                    break;

                case 4:
                    System.out.print("Informe o pagamento: ");
                    double payment = scanner.nextDouble();
                    System.out.print("Informe a taxa de juros: ");
                    double rate = scanner.nextDouble();
                    System.out.print("Informe o número de períodos: ");
                    double numPeriods = scanner.nextDouble();
                    System.out.print("Informe o tipo (1 ou 0): ");
                    float type = scanner.nextFloat();
                    double pvResult = FinanMax.pv(payment, rate, numPeriods, type);
                    System.out.println("Valor Presente: " + df.format(pvResult));
                    break;

                case 5:
                    System.out.print("Informe o valor futuro: ");
                    double futureVal = scanner.nextDouble();
                    System.out.print("Informe o valor presente: ");
                    double presentVal = scanner.nextDouble();
                    System.out.print("Informe o número de períodos: ");
                    double numPeriod = scanner.nextDouble();
                    System.out.print("Informe o período (1 ou 0): ");
                    float period = scanner.nextFloat();
                    double rateResult = FinanMax.rate(futureVal, presentVal, numPeriod, period);
                    System.out.println("Taxa de Juros: " + df.format(rateResult));
                    break;

                case 6:
                    System.out.print("Informe o pagamento: ");
                    double paymentValue = scanner.nextDouble();
                    System.out.print("Informe a taxa de juros: ");
                    double intRate = scanner.nextDouble();
                    System.out.print("Informe o valor futuro: ");
                    double futureValue = scanner.nextDouble();
                    double termResult = FinanMax.term(paymentValue, intRate, futureValue);
                    System.out.println("Número de Períodos: " + df.format(termResult));
                    break;

                case 0:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
