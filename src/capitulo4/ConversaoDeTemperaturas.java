package capitulo4;
import java.util.Scanner;

public class ConversaoDeTemperaturas {
	public static void main(String[] args) {
		int opcao;
		float temperatura;
	    Scanner input = new Scanner(System.in);

	    System.out.println("1 - Celsius -> Kelvin");
	    System.out.println("2 - Celsius -> Fahrenheit");
	    System.out.println("3 - Kelvin -> Celsius");
	    System.out.println("4 - Kelvin -> Fahrenheit");
	    System.out.println("5 - Fahrenheit -> Celsius");
	    System.out.println("6 - Fahrenheit -> Kelvin");
	    System.out.print("Escolha uma opção: ");
	    opcao = input.nextInt();

	    System.out.print("Digite a temperatura: ");
	    temperatura = input.nextFloat();

	    switch (opcao) {
	        case 1:
	            System.out.printf("%.2f°C = %.2f K", temperatura, temperatura + 273.15);
	            break;
	        case 2:
	            System.out.printf("%.2f°C = %.2f°F", temperatura, (9.0/5.0)*temperatura + 32);
	            break;
	        case 3:
	            System.out.printf("%.2f K = %.2f°C", temperatura, temperatura - 273.15);
	            break;
	        case 4:
	            System.out.printf("%.2f K = %.2f°F", temperatura, (9.0/5.0)*(temperatura - 273.15) + 32);
	            break;
	        case 5:
	            System.out.printf("%.2f°F = %.2f°C", temperatura, (5.0/9.0)*(temperatura - 32));
	            break;
	        case 6:
	            System.out.printf("%.2f°F = %.2f K", temperatura, (5.0/9.0)*(temperatura - 32) + 273.15);
	            break;
	        default:
	            System.out.println("Opção inválida.");
	    }
	}   
}
