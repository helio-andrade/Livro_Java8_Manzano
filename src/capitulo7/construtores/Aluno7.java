package capitulo7.construtores;

public class Aluno7 extends Sala3 {
	
	public String nome;
	public float nota1, nota2;
	private float media;
	
	Aluno7(String nome, float primeiraNota, float segundaNota, int numeroSala){
		this.nome = nome;
		this.nota1 = primeiraNota;
		this.nota2 = segundaNota;
		this.sala = numeroSala;
	}
	
	protected void finalize() {}
	
	public float calcularMedia(float primeiraNota, float segundaNota) {
		media = (primeiraNota + segundaNota) / 2;
		return media;
	}
	
	public static boolean verificarCondicaoAluno(float mediaAluno, double mediaEsperada) {
		boolean alunoAprovado = true;
		if (mediaAluno < mediaEsperada)
			alunoAprovado = false;
		
		return alunoAprovado;
	}
}
