package capitulo5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C05Ex11 {

    public static void main(String[] args) {
        String idadeTxt = "", alturaTxt = "";
        int idade = 0;
        float altura = 0;

        System.out.print("\nIdade ....: ");
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            idadeTxt = br.readLine();
            idade = Integer.parseInt(idadeTxt);
        } catch (Exception e) {
            idadeTxt = "";
        }

        System.out.print("Altura ...: ");
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            alturaTxt = br.readLine();
            altura = Float.parseFloat(alturaTxt);
        } catch (Exception e) {
            alturaTxt = "";
        }

        if (idade <= 1)
            System.out.println("\nIdade " + idade + " ano.");
        else
            System.out.println("\nIdade " + idade + " anos.");
        System.out.println("Altura " + altura + " m.\n");
    }
}
