package capitulo8;

import java.util.Scanner;

public class C08Ex08v2 {
    public static void main(String[] args) {
        int[] elementos = new int[10];
        int indice, valorPesquisa;
        boolean encontrado;
        String continuar;

        try (Scanner scanner = new Scanner(System.in)) {
            // Entrada de dados
            for (indice = 0; indice < 10; indice++) {
                System.out.print("Digite o " + (indice + 1) + "º elemento: ");
                elementos[indice] = scanner.nextInt();
            }

            scanner.nextLine(); // Consumir a nova linha deixada por nextInt()

            // Pesquisa de dados
            do {
                System.out.print("Digite o valor a ser pesquisado: ");
                valorPesquisa = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha deixada por nextInt()

                indice = 0;
                encontrado = false;
                while (indice < 10 && !encontrado) {
                    if (valorPesquisa == elementos[indice])
                        encontrado = true;
                    else
                        indice++;
                }

                if (encontrado)
                    System.out.println(valorPesquisa + " localizado na posição " + (indice + 1));
                else
                    System.out.println(valorPesquisa + " não localizado...");

                System.out.print("\n\nContinuar? [S]im/[N]ão + <ENTER>. ");
                continuar = scanner.nextLine().trim();
            } while (continuar.equalsIgnoreCase("S"));

            scanner.close();
        }
    }
}
