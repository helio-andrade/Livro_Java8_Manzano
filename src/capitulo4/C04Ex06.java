package capitulo4;
import java.util.Scanner;

public class C04Ex06 {

	public static void main(String[] args) {
		int numero;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		numero = s.nextInt();
		
		if (numero >= 20 && numero <= 90)
			System.out.println("O valor esta entre 20 e 90.");
		else
			System.out.println("O valor nao esta entre 20 e 90.");
		
		s.close();

	}

}
