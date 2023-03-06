package capitulo4;

import java.util.Scanner;

public class Exerc04Ex1i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a densidade da esfera: ");
        double densidade = sc.nextDouble();

        System.out.print("Digite o raio da esfera: ");
        double raio = sc.nextDouble();

        double peso = densidade * 4 * 3.141592653589793 * raio * raio * raio / 3;

        System.out.printf("O peso da esfera é: %.2f\n", peso);

        System.out.println("\nTecle ENTER para sair...");
        sc.nextLine(); // aguardar ENTER para sair
    }
}
