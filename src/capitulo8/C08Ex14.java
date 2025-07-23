package capitulo8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08Ex14 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        int t;
        String n;
        
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        
        System.out.print("\nQuantos nomes a serem digitados? ");
        t = s1.nextInt();
        
        s1.close();
        s2.close();
    }
}
