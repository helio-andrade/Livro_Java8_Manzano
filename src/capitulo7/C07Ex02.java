package capitulo7;

import java.util.Scanner;

public class C07Ex02 {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nome ...: ");
		aluno.nome = input.nextLine();
		
		System.out.print("Media ..: ");
		aluno.media = input.nextFloat();
		
		System.out.println("Nome: " + aluno.nome);
		System.out.println("Media: " + aluno.media);
		
		input.close();
	}
}
