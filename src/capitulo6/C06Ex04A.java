package capitulo6;

import java.util.Scanner;

public class C06Ex04A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inteiro (de 0 a 25): ");
        byte x = scanner.nextByte();
        scanner.close();
        
        if (x >= 0 && x <= 25) {
            long resultadoFatorial = calcularFatorial(x);
            System.out.println(x + "! = " + resultadoFatorial);
        } else {
            System.out.println("O valor de entrada deve estar no intervalo de 0 a 25.");
        }
    }
    
    public static long calcularFatorial(long n) {
        if (n <= 0) {
            return 1;
        } else {
            return calcularFatorial(n - 1) * n;
        }
    }
}
