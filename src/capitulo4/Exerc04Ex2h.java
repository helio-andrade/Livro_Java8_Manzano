package capitulo4;

import java.util.Scanner;

public class Exerc04Ex2h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor, maior, menor;
        System.out.print("Digite o primeiro valor: ");
        valor = sc.nextInt();
        maior = valor;
        menor = valor;

        for (int i = 1; i < 5; i++) {
            System.out.print("Digite o próximo valor: ");
            valor = sc.nextInt();
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        sc.close();
    }
}
