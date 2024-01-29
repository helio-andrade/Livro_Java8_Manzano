package capitulo7.heranca;

public class Aluno extends Sala {
    String nome;
    double media;

    public static boolean situacao(double nota, double media) {
        return nota >= media;
    }
}