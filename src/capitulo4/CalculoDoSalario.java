package capitulo4;
// Cálculo de Salário
import java.util.Scanner;

public class CalculoDoSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("HORAS TRABALHADAS ......: ");
        double HT = input.nextDouble();
    
        System.out.print("VALOR DA HORA ..........: ");
        double VH = input.nextDouble();
    
        System.out.print("PERCENTUAL DE DESCONTO .: ");
        double PD = input.nextDouble();
    
        double SB = HT * VH;
        double TD = (PD / 100) * SB;
        double SL = SB - TD;
    
        System.out.println("SALÁRIO BRUTO ..........: " + SB);
        System.out.println("DESCONTO ...............: " + TD);
        System.out.println("SALÁRIO LÍQUIDO ........: " + SL);
    
        input.close();
    }    
}
