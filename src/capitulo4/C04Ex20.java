package capitulo4;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class C04Ex20 {

	public static void main(String[] args) {
		long x = 1_000_000, y, r;
		DecimalFormat df = new DecimalFormat();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro (-128/127): ");
		y = sc.nextByte();
		
		r = x + y + 3_000_000;
		
		df.applyPattern("#,###,###0");
		System.out.println("Resultado = " + df.format(r));
	}
	
}
