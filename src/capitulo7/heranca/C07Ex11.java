package capitulo7.heranca;

import java.util.Scanner;

public class C07Ex11 {
	public static void main(String[] args) {
		Aluno5 aluno = new Aluno5();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nome......: ");
		aluno.nome = input.nextLine();
		
		System.out.println("1ª nota...: ");
		aluno.n1 = input.nextFloat();
		
		System.out.println("2ª nota...: ");
		aluno.n2 = input.nextFloat();
		
		System.out.println("Sala......: ");
		aluno.sala = input.nextInt();
		
		System.out.println("Nome......: " + aluno.nome);
		System.out.println("Média.....: " + 
							aluno.calcMedia(aluno.n1, aluno.n2));
		System.out.println("Sala......: " + aluno.sala);
		System.out.print("\nSituação..: ");
		if(Aluno5.condAluno(aluno.calcMedia(aluno.n1, aluno.n2), 5.0))
			System.out.println("Aprovado.");
		else
			System.out.println("Reprovado.");
		
		input.close();
	}
}
