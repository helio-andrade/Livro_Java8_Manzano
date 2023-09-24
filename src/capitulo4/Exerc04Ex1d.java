package capitulo4;
import java.util.Scanner;

public class Exerc04Ex1d {

    public static void main(String[] args) {
        double c, k;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a temperatura em c: ");
        c = input.nextDouble();
        
        k = c + 273.15;
        
        System.out.printf("%.2f °C = %.2f K", c, k);
        
        System.out.println("\nTecle ENTER para sair...");
        input.nextLine(); // aguardar ENTER para sair
        
        input.close();
    }
}
