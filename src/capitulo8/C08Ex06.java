package capitulo8;

import java.util.Arrays;
import java.util.Scanner;

public class C08Ex06 {
	public static void main(String[] args) {
		int[] numeros = new int[10];
		
		Scanner input = new Scanner(System.in);
		
		// Entrada de dados
		for(int i =0; i <= 9; i++) {
			System.out.println("Digite o " + (i + 1) + "o. elemento: ");
			numeros[i] = input.nextInt();
		}
		
		// Processamento: Ordenação
		Arrays.sort(numeros);
		
		// Apresentação do arranjo
		for(int i = 0; i <= 9; i++)
			System.out.printf("%3do. valor = %s\n", i + 1, numeros[i]);
		
		input.close();
	}
}
