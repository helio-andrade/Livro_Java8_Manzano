import java.util.Scanner;

public class C04Ex07 {

	public static void main(String[] args) {
		int codigo;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o codigo de acesso: ");
		codigo = s.nextInt();
		
		if (codigo == 1 || codigo == 2 || codigo == 3) {
			if (codigo == 1)
				System.out.println("UM");
			if (codigo == 2)
				System.out.println("DOIS");
			if (codigo == 3)
				System.out.println("TRES");
		}
		else
			System.out.println("Codigo invalido!");
		
	}

}
