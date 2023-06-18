package capitulo5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C05Ex11v2 {

    public static void main(String[] args) {
        String idadeTxt, alturaTxt;
        float idade;
        float altura;

        System.out.println("\nIdade ....: ");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            idadeTxt = br.readLine();
        } catch (Exception e) {
            idadeTxt = "";
        }

        System.out.println("Altura ...: ");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            alturaTxt = br.readLine();
        } catch (Exception e) {
            alturaTxt = "";
        }

        idade = Float.parseFloat(idadeTxt);
        altura = Float.parseFloat(alturaTxt);

        if (idade <= 1)
            System.out.println("\nIdade " + idade + " ano.");
        else
            System.out.println("\nIdade " + idade + " anos.");
        System.out.println("Altura " + altura + " m.\n");
    }

}
