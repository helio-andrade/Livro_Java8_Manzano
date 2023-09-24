package capitulo7;

public class Aluno {
	String nome;
	float media;
	
	public static boolean situacaoAluno(float valorMedia, double mediaAprovacao) {
		boolean situacao = true;
		
		if (valorMedia < mediaAprovacao)
			situacao = false;
		
		return(situacao);
	}
}
