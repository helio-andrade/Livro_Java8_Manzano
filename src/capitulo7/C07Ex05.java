package capitulo7;

public class C07Ex05 {

    static class Livro {
        String nome;
    }

    public static void main(String[] args) {
        // Criação dos objetos C07Ex06Livro
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = livro2;

        // Atribuição dos nomes aos livros
        livro1.nome = "A Ilha do Tesouro";
        livro2.nome = "A Máquina do Tempo";
        livro3.nome = "20.000 Léguas Submarinas";

        // Exibe os nomes dos livros
        System.out.println("\nLivro #1: " + livro1.nome);
        System.out.println("C07Ex06Livro #2: " + livro2.nome);
        System.out.println("C07Ex06Livro #3: " + livro3.nome);

        // Variáveis para os valores
        float valor1, valor2, valor3;

        valor1 = 10.55f;
        valor2 = 12.67f;
        valor3 = valor2;

        // Exibe os valores
        System.out.println("\nValor #1: " + valor1);
        System.out.println("Valor #2: " + valor2);
        System.out.println("Valor #3: " + valor3);
    }
}
