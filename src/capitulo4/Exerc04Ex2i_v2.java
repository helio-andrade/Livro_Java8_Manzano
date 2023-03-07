package capitulo4;

import java.util.Scanner;

public class Exerc04Ex2i_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        
        int num = sc.nextInt();
        String resultado = (num % 2 == 0) ? "par" : "ímpar";
        
        System.out.println("O número digitado é " + resultado + ".");
        sc.close();
    }
}
