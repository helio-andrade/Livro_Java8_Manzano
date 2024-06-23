package capitulo8;

import java.util.Scanner;

public class C08Ex05 {
    public static void main(String[] args) {
        // Declaração de variáveis
        String[] nomes = new String[5];
        
        // Entrada de dados
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("\nDigite o " + (i + 1) + "o. nome: ");
            nomes[i] = input.nextLine();
        }
        
        // Processamento: ordenação
        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = i + 1; j < nomes.length; j++) {
                if (nomes[i].compareTo(nomes[j]) > 0) {
                    String temp = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = temp;
                }
            }
        }
        
        // Apresentação dos arranjos
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + "o. nome = " + nomes[i]);
        }
        
        input.close();
    }
}
