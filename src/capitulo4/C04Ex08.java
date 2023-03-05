package capitulo4;
import java.util.Scanner;

public class C04Ex08 {

	public static void main(String[] args) {
		String nome1, nome2;
		int sexo1, sexo2;
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		System.out.println();
		
		System.out.println("Digite o primeiro nome: ");
		nome1 = s1.nextLine();
		System.out.println("Digite o sexo M[1]/F[2]: ");
		sexo1 = s1.nextInt();
		
		System.out.println("Digite o primeiro nome: ");
		nome2 = s2.nextLine();
		System.out.println("Digite o sexo M[1]/F[2]: ");
		sexo2 = s2.nextInt();
		
		if (sexo1 == 1 ^ sexo2 == 1)
			System.out.println(nome1 + " pode dancar com  " + nome2);
		else
			System.out.println(nome1 + " nao pode dancar com  " + nome2);
		
		System.out.println();
	}

}
