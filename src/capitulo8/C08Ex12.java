package capitulo8;

import java.text.DecimalFormat;

public class C08Ex12 {
    public static void main(String[] args) {
        // Declaração das variáveis
        float nota1, nota2, nota3, nota4, mediaNotas;
        DecimalFormat formatoDecimal = new DecimalFormat("0.00");

        // Conversão dos argumentos para valores float
        nota1 = Float.parseFloat(args[0]);
        nota2 = Float.parseFloat(args[1]);
        nota3 = Float.parseFloat(args[2]);
        nota4 = Float.parseFloat(args[3]);

        // Cálculo da média
        mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;

        // Verificação da média e exibição do resultado
        if (mediaNotas >= 5) {
            System.out.print("Aluno(a) aprovado com média ");
        } else {
            System.out.print("Aluno(a) reprovado com média ");
        }
        System.out.println(formatoDecimal.format(mediaNotas));
    }
}
