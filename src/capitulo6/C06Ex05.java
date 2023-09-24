package capitulo6;

import java.util.Scanner;

public class C06Ex05 {
	public static void main(String[] args) {
		byte x;
		long r;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print(
				"Digite um número inteiro (0 a 25): ");
		x = s.nextByte();
		r = C06Ex04.calcularFatorial(x);
		System.out.println(x + "! = " + r);
		
		s.close();
	}
	
}
