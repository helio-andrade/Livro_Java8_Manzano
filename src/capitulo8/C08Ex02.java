package capitulo8;

import java.util.Scanner;

public class C08Ex02 {
    public static void main(String[] args) {
        // Criação do scanner para entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        // Declaração dos arrays A e B com tamanho 10
        int[] A = new int[10];
        int[] B = new int[10];
        
        // Leitura dos elementos do array A
        System.out.println("Digite os elementos do array A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = entrada.nextInt();
        }
        
        // Construção do array B
        for (int i = 0; i < A.length; i++) {
            int elemento = A[i];
            if (i % 2 == 0) { // Se o índice for par
                B[i] = elemento * 5;
            } else { // Se o índice for ímpar
                B[i] = elemento + 5;
            }
        }
        
        // Mostrando os conteúdos dos arrays A e B
        System.out.println("\nConteúdo do array A:");
        for (int elemento : A) {
            System.out.print(elemento + " ");
        }
        
        System.out.println("\nConteúdo do array B:");
        for (int elemento : B) {
            System.out.print(elemento + " ");
        }
        
        // Fechando o scanner
        entrada.close();
    }
}
