package capitulo4;

import java.util.Scanner;

public class Exerc04Ex2b {

	public static void main(String[] args) {
		System.out.print("Digite o primeiro valor: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        
        if (n > 0)
        	System.out.println("\n" + n);
        else
        	System.out.println("\n" + (-1)*n);
        
        sc.close();

	}

}
