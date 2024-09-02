package capitulo8;

import java.util.Scanner;

public class C08Ex08 {
    public static void main(String[] args) {
        int[] arrayA = new int[10];
        int i, pesq;
        boolean acha;
        String resp;

        try (Scanner input = new Scanner(System.in)) {
			// Entrada de dados
			for (i = 0; i < 10; i++) {
			    System.out.print("Digite o " + (i + 1) + "o. elemento: ");
			    arrayA[i] = input.nextInt();
			}

			input.nextLine(); // Consumir a nova linha deixada por nextInt()

			// Pesquisa de dados
			do {
			    System.out.print("Digite o valor da pesquisa: ");
			    pesq = input.nextInt();
			    input.nextLine(); // Consumir a nova linha deixada por nextInt()

			    i = 0;
			    acha = false;
			    while (i < 10 && !acha) {
			        if (pesq == arrayA[i])
			            acha = true;
			        else
			            i++;
			    }

			    if (acha)
			        System.out.println(pesq + " localizado na posição " + (i + 1));
			    else
			        System.out.println(pesq + " não localizado...");

			    System.out.println("\n\nContinuar? [S]im/[N]ão + <ENTER>. ");
			    resp = input.nextLine().trim();
			} while (resp.equalsIgnoreCase("S"));

			input.close();
		}
    }
}
