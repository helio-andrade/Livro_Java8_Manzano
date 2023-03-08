package capitulo4;

import java.util.Scanner;

public class Exerc04Ex3f {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();
        scanner.close();

        int fatorial = 1;

        System.out.println("\nUtilizando for:");
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println(numero + "! = " + fatorial);

        fatorial = 1;
        int i = 1;
        System.out.println("\nUtilizando while:");
        while (i <= numero) {
            fatorial *= i;
            i++;
        }
        System.out.println(numero + "! = " + fatorial);

        fatorial = 1;
        i = 1;
        System.out.println("\nUtilizando do/while:");
        do {
            fatorial *= i;
            i++;
        } while (i <= numero);
        System.out.println(numero + "! = " + fatorial);
    }
}

