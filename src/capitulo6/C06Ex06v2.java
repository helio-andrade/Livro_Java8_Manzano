package capitulo6;

import java.text.DecimalFormat;
import java.util.Scanner;
import net.guiatech.livro.java.FinanMax;

public class C06Ex06v2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a taxa de juros mensal: ");
        double taxaDeJurosMensal = scanner.nextDouble();

        System.out.print("Informe o valor futuro: ");
        double valorFuturo = scanner.nextDouble();

        System.out.print("Informe o valor presente: ");
        double valorPresente = scanner.nextDouble();

        double prazoCompostoAnos = FinanMax.cterm(taxaDeJurosMensal/12, valorFuturo, valorPresente) / 12;

        System.out.println("MÉDIA DE " + df.format(prazoCompostoAnos) + " anos");

        // Feche o scanner quando terminar de usá-lo
        scanner.close();
    }
}
