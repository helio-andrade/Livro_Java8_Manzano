package capitulo4;
import java.util.Scanner;

public class C04Ex05 {

	public static void main(String[] args) {
		int a, b, r;
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Digite o valor <A>: ");
		a = s.nextInt();
		
		System.out.print("Digite o valor <B>: ");
		b = s.nextInt();
		
		r = a + b;
		System.out.println();
		
		if (r > 10)
			System.out.println("Resultado ultrapassa o valor 10.");
		else
			System.out.println("Resultado nao ultrapassa o valor 10.");
		System.out.println();
	}

}
