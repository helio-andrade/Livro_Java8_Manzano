package capitulo4;
import java.util.Scanner;

public class Exerc04Ex1f {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;

        System.out.printf("%.2f °F = %.2f K", fahrenheit, kelvin);

        System.out.println("\nTecle ENTER para sair...");
        input.nextLine(); // aguardar ENTER para sair
    }
}
