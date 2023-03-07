package capitulo4;

import java.util.Scanner;

public class Exerc04Ex2f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = sc.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int valor3 = sc.nextInt();

        System.out.print("Digite o quarto valor: ");
        int valor4 = sc.nextInt();

        if (valor1 % 2 == 0 || valor1 % 3 == 0) {
            System.out.println("O valor " + valor1 + " é divisível por 2 ou 3.");
        }
        if (valor2 % 2 == 0 || valor2 % 3 == 0) {
            System.out.println("O valor " + valor2 + " é divisível por 2 ou 3.");
        }
        if (valor3 % 2 == 0 || valor3 % 3 == 0) {
            System.out.println("O valor " + valor3 + " é divisível por 2 ou 3.");
        }
        if (valor4 % 2 == 0 || valor4 % 3 == 0) {
            System.out.println("O valor " + valor4 + " é divisível por 2 ou 3.");
        }

        sc.close();
    }
}
