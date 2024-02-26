package capitulo7.heranca;

public class Aluno5 extends Sala2 {
	
	public String nome;
	public float n1, n2;
	private float media;
	
	public float calcMedia(float nt1, float nt2) {
		media = (nt1 + nt2) / 2;
		
		return media;
	}
	
	public static boolean condAluno(float alumedia, double cormedia) {
		boolean condaluno = true;
		
		if (alumedia < cormedia)
			condaluno = false;
		
		return condaluno;
	}
}
