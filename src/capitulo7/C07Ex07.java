package capitulo7;

import java.util.Scanner;

public class C07Ex07 {

    public static void main(String[] args) {
        Aluno4 aluno = new Aluno4(); 
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Nome: ");
			aluno.nome = input.nextLine();

			System.out.print("Turma: ");
			aluno.nomeSala = input.nextLine();
			
			System.out.print("Nota 1: ");
			aluno.nota1 = input.nextDouble();

			System.out.print("Nota 2: ");
			aluno.nota2 = input.nextDouble();

			double mediaAluno = aluno.calcularMedia();
			System.out.println("Média: " + mediaAluno);

			System.out.print("Digite a média mínima para aprovação: ");
			double mediaMinima = input.nextDouble();

			boolean situacaoAluno = Aluno4.verificarSituacao(mediaAluno, mediaMinima);

			
			System.out.println("\nSala: " + aluno.nomeSala);
			if (situacaoAluno) {
			    System.out.println("\nSituação do aluno: Aprovado.");
			} else {
			    System.out.println("\nSituação do aluno: Reprovado.");
			}
		}
    }
}
