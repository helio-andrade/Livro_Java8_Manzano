package capitulo4;

import java.util.Scanner;

public class Exerc04Ex2c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, nota4;
        
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextDouble();
        
        System.out.print("Digite a quarta nota: ");
        nota4 = sc.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        if(media >= 5.0) {
            System.out.printf("Aluno aprovado! Média: %.2f", media);
        } else {
            System.out.printf("Aluno reprovado! Média: %.2f", media);
        }
        
        sc.close();
    }
}
