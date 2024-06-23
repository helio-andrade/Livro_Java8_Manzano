package capitulo8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class C08Ex07 {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[10];  // Use Integer instead of int for Collections.reverseOrder()

        Scanner input = new Scanner(System.in);

        // Entrada de dados
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "o. elemento: ");
            numeros[i] = input.nextInt();
        }

        // Processamento: Ordenação
        Arrays.sort(numeros, Collections.reverseOrder());

        // Apresentação do arranjo
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%3do. valor = %d\n", i + 1, numeros[i]);
        }

        input.close();
    }
}
