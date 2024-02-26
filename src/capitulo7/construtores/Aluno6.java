package capitulo7.construtores;

public class Aluno6 extends Sala3 {
	public String nome;
	public float n1, n2;
	private float media;
	
	Aluno6() {
		nome = "";
		n1 = 0;
		n2 = 0;
	}
	
	protected void finalize() {};
	
	public float calcularMedia(float nt1, float nt2) {
		media = (nt1 + nt2)/2;
		
		return (media);
	}
	
	public static boolean condAluno(float alunoMedia, double corMedia) {
		boolean condAluno = true;
		
		if (alunoMedia < corMedia)
			condAluno = false;
		
		return (condAluno);
	}
}
