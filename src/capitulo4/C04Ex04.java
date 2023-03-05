package capitulo4;
import java.util.Scanner;

public class C04Ex04 {

	public static void main(String[] args) {
		int a, b, r;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		System.out.println("A = ");
		a = s.nextInt();
		
		System.out.println("B = ");
		b = s.nextInt();
		
		r = a + b;
		
		System.out.println("\nR = " + a + " + " + b + " = " + r);

	}
}
