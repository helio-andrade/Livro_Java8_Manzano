package capitulo4;

import java.util.Scanner;

public class Exerc04Ex2i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valor = sc.nextInt();

        if (valor % 2 == 0) {
            System.out.println("O valor é par.");
        } else {
            System.out.println("O valor é ímpar.");
        }

        sc.close();
    }
}
