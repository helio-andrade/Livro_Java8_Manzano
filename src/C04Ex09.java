import java.util.Scanner;

public class C04Ex09 {

	public static void main(String[] args) {
		int a, b, c, x;
		
		Scanner s = new Scanner(System.in);		
		System.out.println();
		System.out.println("Digite o valor de <A>: ");
		a = s.nextInt();
		System.out.println("Digite o valor de <B>: ");
		b = s.nextInt();
		System.out.println("Digite o valor de <C>: ");
		c = s.nextInt();
		
		if (!(c > 5))
			x = (a + b) * c;
		else
			x = (a - b) * c;
		
		System.out.println("X = " + x);
			
	}

}
