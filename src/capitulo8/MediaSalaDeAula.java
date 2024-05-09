package capitulo8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaSalaDeAula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Solicita o número de alunos na sala
        System.out.print("Digite o número de alunos na sala: ");
        int numAlunos = scanner.nextInt();

        // Array para armazenar as notas dos alunos
        double[] notas = new double[numAlunos];

        // Loop para receber as notas de cada aluno
        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calcula a média das notas
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / numAlunos;

        // Imprime a média das notas
        System.out.println("Média da sala de aula: " + df.format(media));

        scanner.close();
    }
}

