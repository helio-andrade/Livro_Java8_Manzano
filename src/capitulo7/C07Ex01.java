package capitulo7;

import java.util.Scanner;

public class C07Ex01 {
    public static class Aluno {
        String nome = "";
        float media = 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Nome: ");
        aluno.nome = input.nextLine();

        System.out.print("Nota: ");
        aluno.media = input.nextFloat();

        System.out.println("Nome: " + aluno.nome 
        				 + "\nMédia: " + aluno.media);

        input.close();
    }
}
