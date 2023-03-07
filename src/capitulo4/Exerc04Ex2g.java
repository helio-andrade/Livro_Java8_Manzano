package capitulo4;

import java.util.Scanner;

public class Exerc04Ex2g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro entre 1 e 9: ");
        int valor = sc.nextInt();

        if (valor >= 1 && valor <= 9) {
            System.out.println("O valor está na faixa permitida.");
        } else {
            System.out.println("O valor está fora da faixa permitida.");
        }

        sc.close();
    }
}

