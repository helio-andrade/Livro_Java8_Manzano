package capitulo4;

import java.util.Scanner;

public class Exerc04Ex2a {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int b = sc.nextInt();

        int maior, menor;
        if (a > b) {
            maior = a;
            menor = b;
        } else {
            maior = b;
            menor = a;
        }

        int diferenca = maior - menor;
        System.out.printf("A diferença entre %d e %d é %d", maior, menor, diferenca);

        sc.close();
        
    }
}
