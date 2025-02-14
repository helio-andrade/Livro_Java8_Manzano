package capitulo8;

import java.text.DecimalFormat;

public class C08Ex13v3 {
    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4, mediaNotas;
        DecimalFormat formatoDecimal = new DecimalFormat("0.00");

        if (args.length != 4) {
            System.out.println("Uso: C08Ex13 nota1 nota2 nota3 nota4");
            return;
        }

        try {
            nota1 = Float.parseFloat(args[0]);
            nota2 = Float.parseFloat(args[1]);
            nota3 = Float.parseFloat(args[2]);
            nota4 = Float.parseFloat(args[3]);

            mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;

            if (mediaNotas >= 5) {
                System.out.print("Aluno(a) aprovado com média ");
            } else {
                System.out.print("Aluno(a) reprovado com média ");
            }
            System.out.println(formatoDecimal.format(mediaNotas));
        } catch (NumberFormatException e) {
            System.out.println("Erro: As notas devem ser números válidos.");
        }
    }
}