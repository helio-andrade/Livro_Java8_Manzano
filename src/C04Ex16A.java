import java.util.Scanner;

public class C04Ex16A {
	public static void main(String[] args) {
		
		int dividendo, divisor, quociente;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println();
			
			try {
				System.out.println("Informe o valor do dividendo...: ");
				dividendo = input.nextInt();
				
				System.out.println("Informe o valor do divisor..: ");
				divisor = input.nextInt();
				
				quociente = dividendo / divisor;
				
				System.out.println("\nResultado = \n" + quociente);
				
			}
			
			catch (final Exception erro) {
				if (erro instanceof ArithmeticException) {
					System.out.println("\nErro de divisão por zero.\n");
				} else {
					System.out.println("\nOutro erro.\n");
				}
				System.out.println("Tipo de exceção: " + erro + ".");
			}
		}
		
	}
}
