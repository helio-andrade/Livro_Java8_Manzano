package capitulo7.construtores;

public class C07Ex13 {
	public static void main(String[] args) {
		
		Aluno7 aluno = new Aluno7("Hélio Andrade", 10, 9, 5);
		
		mostrarDados(aluno);
		
		aluno.nome = "Fulano de Tal";
		aluno.nota1 = 10.0f;
		aluno.nota2 = 9.5f;
		aluno.sala = 123;
		
		mostrarDados(aluno);
	}
	
	public static void mostrarDados(Aluno7 dados) {
		System.out.println("\nNome........: " + dados.nome
						 + "\nMedia.......: " + dados.calcularMedia(dados.nota1, dados.nota2)
						 + "\nSala........: " + dados.sala
						 + "\nSituação....: ");
		if (Aluno7.verificarCondicaoAluno(
				dados.calcularMedia(dados.nota1, dados.nota2), 5.0))
			System.out.println(" APROVADO!\n");
		else
			System.out.println(" REPROVADO!\n");
	}	
}
