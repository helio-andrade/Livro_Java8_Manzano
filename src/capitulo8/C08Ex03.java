package capitulo8;

import java.util.Scanner;

public class C08Ex03 {

    public static void main(String[] args) {
        
        int[] numeros = new int[5];
        int soma = 0;
        
        Scanner input = new Scanner(System.in);
        
        // Entrada de dados
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º elemento: ");
            numeros[i] = input.nextInt();
        }
        
        // Processamento par/ímpar
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                soma += numero;
            }
        }
        
        // Apresentação dos resultados
        System.out.println("\nSoma dos números ímpares = " + soma);
        
        input.close();
    }
}
