package capitulo4;
import java.text.DecimalFormat;
import java.util.Scanner;

public class C04Ex03 {

	public static void main(String[] args) {
		// Declaração de variáveis
		String nome="";
		int idade=0;
		float altura=0;
		
		// Instanciação dos objetos de entrada de dados 
		DecimalFormat df = new DecimalFormat();
		Scanner s = new Scanner(System.in);
		
		// Entradas
		System.out.println();
		System.out.print("Digite seu nome .....: ");
		nome = s.nextLine();
		
		System.out.print("Digite sua idade ....: ");
		idade = s.nextInt();
		
		System.out.print("Digite sua altura ...: ");
		altura = s.nextFloat();
		
		// Saídas
		System.out.println();
		System.out.print("Digite seu nome .....: " + nome);
		System.out.print("\nDigite sua idade ....: " + idade + " anos");
		df.applyPattern("0.00");
		System.out.print("\nDigite sua altura ...: " + df.format(altura) + " m");
		System.out.println();

	}

}
