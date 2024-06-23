package capitulo8;

import java.util.Scanner;

public class C08Ex04v2 {
    public static void main(String[] args) {
        final int TAMANHO_ARRAY = 5;
        int[] numeros = new int[TAMANHO_ARRAY];

        Scanner scanner = new Scanner(System.in);
        
        try {
            for (int i = 0; i < TAMANHO_ARRAY; i++) {
                System.out.print("Digite o " + (i + 1) + "º elemento: ");
                numeros[i] = scanner.nextInt();
            }

            ordenarArray(numeros);

            for (int i = 0; i < TAMANHO_ARRAY; i++) {
                System.out.println((i + 1) + "º valor: " + numeros[i]);
            }
        } finally {
            scanner.close();
        }
    }

    private static void ordenarArray(int[] array) {
        int tamanho = array.length;
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
