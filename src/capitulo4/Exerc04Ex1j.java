package capitulo4;

import java.util.Scanner;

public class Exerc04Ex1j {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        // Troca os valores
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Valores trocados: ");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        scanner.close();
    }
}
