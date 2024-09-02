package capitulo5;

import java.util.Scanner;

public class C05Ex10 {
	public static void main(String[] args) {
		int idade;
		float altura;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Idade ....: ");
		idade = entrada.nextInt();
		
		System.out.print("Altura ...: ");
		altura = entrada.nextFloat();
		
		if (idade <= 1)
			System.out.println("Idade " + String.valueOf(idade) + " ano.");
		else
			System.out.println("Idade " + String.valueOf(idade) + " anos.");
		
		System.out.println("Altura " + String.valueOf(altura) + " cm.");
		
		entrada.close();
	}
}