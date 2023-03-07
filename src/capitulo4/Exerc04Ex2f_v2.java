package capitulo4;

import java.util.Scanner;

public class Exerc04Ex2f_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valores[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            if (valores[i] % 2 == 0 || valores[i] % 3 == 0) {
                System.out.println("O valor " + valores[i] + " é divisível por 2 ou 3.");
            }
        }
        sc.close();
    }
}
