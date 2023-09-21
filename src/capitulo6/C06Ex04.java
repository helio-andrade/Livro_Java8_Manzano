package capitulo6;

import java.util.Scanner;

public class C06Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inteiro (de 0 a 25): ");
        byte x = scanner.nextByte();
        scanner.close();
        
        long resultadoFatorial = calcularFatorial(x);
        System.out.println(x + "! = " + resultadoFatorial);
    }

    public static long calcularFatorial(byte n) {
        if (n < 0 || n > 25) {
            throw new IllegalArgumentException("O valor de entrada deve estar no intervalo de 0 a 25.");
        }

        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}
