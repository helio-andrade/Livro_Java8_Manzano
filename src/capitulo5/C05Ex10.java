package capitulo5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05Ex10 {
    public static void main(String[] args) {
        int idade;
        float altura;

        Scanner s = new Scanner(System.in);

        System.out.print("Idade ....: ");
        try {
            idade = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida para idade.");
            s.close();
            return;
        }

        System.out.print("Altura ...: ");
        try {
            altura = s.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida para altura.");
            s.close();
            return;
        }

        String idadeString = String.valueOf(idade);
        String alturaString = String.valueOf(altura);

        if (idade <= 1)
            System.out.println("Idade " + idadeString + " ano.");
        else
            System.out.println("Idade " + idadeString + " anos.");

        System.out.println("Altura " + alturaString + " cm.");

        s.close();
    }
}
