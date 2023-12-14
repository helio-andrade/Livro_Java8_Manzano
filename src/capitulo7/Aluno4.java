package capitulo7;

public class Aluno4 extends Sala {
    public String nome;
    public double nota1, nota2;
    private double media;

    public double calcularMedia() {
        this.media = (this.nota1 + this.nota2) / 2;
        return this.media;
    }

    public static boolean verificarSituacao(double mediaAluno, double mediaMinima) {
        return mediaAluno >= mediaMinima;
    }
}
