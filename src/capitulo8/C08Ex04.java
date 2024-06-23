package capitulo8;

import java.util.Scanner;

public class C08Ex04 {
	public static void main(String[] args) {
		
		int A[] = new int[5];
		int x;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i <= 4; i++) {
			System.out.println("Digite o " + (i+1) + "o. elemento: ");
			A[i] = input.nextInt();
		}
		
		for (int i = 0; i <= 3; i++)
			for (int j = i + 1; j <=4; j++)
				if(A[i] > A[j]) {
					x = A[i];
					A[i] = A[j];
					A[j] = x;
				}
		
		for (int i = 0; i <= 4; i++)
			System.out.println((i + 1) + "o. valor: " + A[i]);
		
		input.close();
	}
}
