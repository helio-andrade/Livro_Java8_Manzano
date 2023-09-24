package capitulo7;

import java.util.Scanner;

public class C07Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nome ...: ");
        String nome = input.nextLine();

        System.out.print("Média ..: ");
        float media = input.nextFloat();

        Aluno aluno = new Aluno(nome, media);

        String situacao = aluno.situacaoAluno(5.0) ? "APROVADO!" : "REPROVADO!";
        System.out.println(situacao);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Média: " + aluno.getMedia());

        input.close();
    }
}
