package capitulo7;

import java.util.Scanner;

public class C07Ex02 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner input = new Scanner(System.in);

        System.out.print("Nome ...: ");
        String nome = input.nextLine();
        aluno.setNome(nome);

        System.out.print("Media ..: ");
        float media = input.nextFloat();
        aluno.setMedia(media);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Media: " + aluno.getMedia());

        input.close();
    }
}
