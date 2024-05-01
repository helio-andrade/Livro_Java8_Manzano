package capitulo7.construtores;

import java.util.Scanner;

class C07Ex12 {
    public static void main(String[] args) {
        Aluno6 aluno = new Aluno6();
        Scanner input = new Scanner(System.in);

        System.out.println("Nome: ");
        aluno.nome = input.nextLine();

        System.out.println("1ª Nota: ");
        aluno.n1 = input.nextFloat();

        System.out.println("2ª Nota: ");
        aluno.n2 = input.nextFloat();

        System.out.println("Sala: ");
        aluno.sala = input.nextInt();
        
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Media: " 
        		+ aluno.calcularMedia(aluno.n1, aluno.n2));
        System.out.println("Sala: " + aluno.sala);
        System.out.println("Situação: ");

        if (Aluno6.condAluno(aluno.calcularMedia(aluno.n1, aluno.n2), 5.0))
        	System.out.println("Aprovado.");
        else
        	System.out.println("Reprovado.");
        
        input.close();
    }
}
