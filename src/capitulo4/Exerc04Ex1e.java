package capitulo4;
import java.util.Scanner;

public class Exerc04Ex1e {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Kelvin: ");
        double kelvin = input.nextDouble();
        
        double celsius = kelvin - 273.15;
        
        System.out.printf("A temperatura de %.2f Kelvin é equivalente a %.2f graus Celsius.", kelvin, celsius);
        
        System.out.println("\nTecle ENTER para sair...");
        input.nextLine(); // aguardar ENTER para sair
        input.close();
    }
}
