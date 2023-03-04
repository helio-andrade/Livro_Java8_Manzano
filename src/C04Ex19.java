import java.util.Scanner;

public class C04Ex19 {
	public static void main(String[] args) {
		int i, resp = 1;
		
		Scanner sc = new Scanner(System.in);
	    
		while (resp == 1) {
			System.out.println();
			
			i = 1;
			while (i <= 5) {
				System.out.println("Valor = " + i);
				i++;
			}
			
			System.out.println("\nDeseja continuar [1]SIM/[2]Não?");
			resp = sc.nextInt();
		}
	}
}
