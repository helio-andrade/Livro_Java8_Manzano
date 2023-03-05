import java.util.Scanner;

public class Exerc04Ex1h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o raio do galão: ");
        double raio = sc.nextDouble();

        System.out.print("Informe a altura do galão: ");
        double altura = sc.nextDouble();

        double volume = 3.141592653589793 * raio * raio * altura;

        System.out.printf("O volume do galão é: %.4f\n", volume);

        System.out.println("\nTecle ENTER para sair...");
        sc.nextLine(); // aguardar ENTER para sair
    }
}
