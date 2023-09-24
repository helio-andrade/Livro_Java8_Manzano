package capitulo4;
import java.util.Scanner;

public class Exerc04Ex1g {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Kelvin: ");
        double kelvin = input.nextDouble();
        
        double fahrenheit = (9 * (kelvin - 273.15) + 160) / 5;
        
        System.out.printf("%.2fK corresponde a %.2f°F", kelvin, fahrenheit);
        
        System.out.println("\nTecle ENTER para sair...");
        input.nextLine(); // aguardar ENTER para sair
        
        input.close();
    }
}

