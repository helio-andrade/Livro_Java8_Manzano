package capitulo6;

import java.util.Scanner;

public class C06Ex03 {
	public static void main(String[] args) {
		byte x;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Digite um valor inteiro (de 0 a 25): ");
		x = s.nextByte();
		fatorial(x);
		
		s.close();
	}
	
	public static void fatorial(byte n) {
		long fat = 1;
		if (n == 0)
			fat = 0;
		else
			for (int i = 1; i <= n; i++)
				fat *= i;
		System.out.println(n + "! = " + fat);
	}
}
