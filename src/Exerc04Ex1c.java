import java.util.Scanner;

public class Exerc04Ex1c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Grau Fahrenheit = ");
        double f = input.nextDouble();

        double c = ((f - 32) * 5) / 9;

        System.out.printf("%.2f °F = %.2f °C%n", f, c);

        input.nextLine(); // consumir nova linha após entrada de dados

        System.out.println("\nTecle ENTER para sair...");
        input.nextLine(); // aguardar ENTER para sair
    }
}
