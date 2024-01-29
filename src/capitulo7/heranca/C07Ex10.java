package capitulo7.heranca;

import java.util.Scanner;

public class C07Ex10 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner input = new Scanner(System.in);

        System.out.println("Nome......: ");
        aluno.nome = input.nextLine();

        System.out.println("Média.....: ");
        aluno.media = input.nextDouble();

        System.out.println("Sala......: ");
        aluno.sala = input.nextInt();

        System.out.println("Nome......: " + aluno.nome);
        System.out.println("Média.....: " + aluno.media);
        System.out.println("Sala......: " + aluno.sala);
        System.out.print("Situação..: ");

        if (aluno.situacao(aluno.media, 5.0))
            System.out.println("Aprovado!");
        else
            System.out.println("Reprovado!");

        input.close();
    }
}