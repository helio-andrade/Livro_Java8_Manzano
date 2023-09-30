package capitulo7;

import java.util.Scanner;

public class C07Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicita o nome do aluno
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        
        // Solicita a média do aluno
        System.out.print("Média: ");
        float media = entrada.nextFloat();

        // Cria um objeto Aluno com o nome e média fornecidos
        Aluno aluno = new Aluno(nome, media);

        // Exibe as informações do aluno
        System.out.println("\nNome: " + aluno.getNome().toUpperCase()); // Converte o nome para maiúsculas
        System.out.println("Média: " + aluno.getMedia());

        // Determina e exibe a situação do aluno
        String situacao = aluno.situacaoAluno(5.0) ? "Aprovado" : "Reprovado";
        System.out.println("\nSituação: " + situacao);

        // Fecha o scanner de entrada
        entrada.close();
    }
}
