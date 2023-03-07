package capitulo4;

import java.util.Scanner;

public class Exerc04Ex2e {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int num3 = sc.nextInt();

        System.out.print("Digite o quarto valor: ");
        int num4 = sc.nextInt();

        if (num1 % 2 == 0 && num1 % 3 == 0) {
            System.out.println("O número " + num1 + " é divisível por 2 e 3.");
        }
        if (num2 % 2 == 0 && num2 % 3 == 0) {
            System.out.println("O número " + num2 + " é divisível por 2 e 3.");
        }
        if (num3 % 2 == 0 && num3 % 3 == 0) {
            System.out.println("O número " + num3 + " é divisível por 2 e 3.");
        }
        if (num4 % 2 == 0 && num4 % 3 == 0) {
            System.out.println("O número " + num4 + " é divisível por 2 e 3.");
        }

        sc.close();
    }
}
