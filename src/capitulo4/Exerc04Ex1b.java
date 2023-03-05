package capitulo4;
import java.util.Scanner;

public class Exerc04Ex1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Grau Celsius = ");
        double celsius = sc.nextDouble();
        
        double fahrenheit = (9.0 * celsius + 160.0) / 5.0;
        
        System.out.printf("%6.2f °C = %6.2f °F\n", celsius, fahrenheit);
        
        System.out.println("\nTecle ENTER para sair...");
        sc.nextLine();
    }
}
