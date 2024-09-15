package capitulo8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C08Ex10 {
    public static void main(String[] args) {
        float nota[][] = new float[8][4];
        byte i, j;
        DecimalFormat df = new DecimalFormat("00.00");
        Scanner input = new Scanner(System.in);
        
        // Leitura das notas
        for (i = 0; i < 8; i++) {
            System.out.println("\nAluno ---> " + (i + 1));
            for (j = 0; j < 4; j++) {
                System.out.print((j + 1) + ".a nota = ");
                nota[i][j] = input.nextFloat();
            }
        }

        // Exibição das notas em formato de tabela
        System.out.println("\nNotas dos Alunos:");
        System.out.println("Aluno\tNota 1\tNota 2\tNota 3\tNota 4");
        for (i = 0; i < 8; i++) {
            System.out.print((i + 1) + "\t");
            for (j = 0; j < 4; j++) {
                System.out.print(df.format(nota[i][j]) + "\t");
            }
            System.out.println();
        }

        input.close();
    }
}
