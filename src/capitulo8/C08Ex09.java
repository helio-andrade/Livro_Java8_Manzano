package capitulo8;

import java.util.Scanner;

public class C08Ex09 {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        String temp, pesq, resposta;
        int inicio, meio, fim;
        
        // Entrada de dados
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = input.nextLine();
        }
        
        // Processamento: ordenação (Método Bubble Sort)
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (nomes[i].compareTo(nomes[j]) > 0) {
                    temp = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = temp;
                }
            }
        }
        
        // Apresentação dos nomes ordenados
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "º nome = " + nomes[i]);
        }
        
        // Pesquisa binária
        do {
            System.out.print("\nDigite o nome a ser pesquisado: ");
            pesq = input.nextLine();
            
            inicio = 0;
            fim = nomes.length - 1;
            meio = 0;
            boolean encontrado = false;

            while (inicio <= fim) {
                meio = (inicio + fim) / 2;
                
                if (nomes[meio].compareTo(pesq) == 0) {
                    encontrado = true;
                    break;
                } else if (nomes[meio].compareTo(pesq) < 0) {
                    inicio = meio + 1;
                } else {
                    fim = meio - 1;
                }
            }

            if (encontrado) {
                System.out.println("Nome encontrado: " + nomes[meio]);
            } else {
                System.out.println("Nome não encontrado.");
            }

            System.out.print("\nDeseja pesquisar outro nome? (S/N): ");
            resposta = input.nextLine();
            
        } while (resposta.equalsIgnoreCase("S"));
                
        input.close();
    }
}
