package capitulo8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C08Ex01 {
    public static void main(String[] args) {
        final int NUM_ALUNOS = 8;
        float mediaAluno[] = new float[NUM_ALUNOS];
        float somaMedias = 0, mediaGeral;

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);

        // Utilizando um loop for para coletar as médias dos alunos
        for (int i = 0; i < NUM_ALUNOS; i++) {
            System.out.print("Media do " + (i+1) + "o. aluno: ");
            mediaAluno[i] = input.nextFloat();
            somaMedias += mediaAluno[i];
        }

        mediaGeral = somaMedias / NUM_ALUNOS;

        System.out.println("\nMedia Geral = " + df.format(mediaGeral));

        input.close();
    }
}
