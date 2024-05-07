package capitulo8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C08Ex01v2 {
    public static void main(String[] args) {
        final int NUM_ALUNOS = 8;
        float mediaAluno[] = new float[NUM_ALUNOS];
        float somaMedias = 0, mediaGeral;

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);

        // Utilizando um loop for-each para coletar as médias dos alunos
        for (float media : mediaAluno) {
            System.out.print("Media do aluno: ");
            media = input.nextFloat();
            somaMedias += media;
        }

        mediaGeral = somaMedias / NUM_ALUNOS;

        System.out.println("\nMedia Geral = " + df.format(mediaGeral));

        input.close();
    }
}
