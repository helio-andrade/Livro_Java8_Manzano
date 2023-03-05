package capitulo4;
import java.util.Scanner;

public class C04Ex22 {
	public static void main(String[] args) {
		int i, resp;
		
		Scanner sc = new Scanner(System.in);
	    
		do {
			System.out.println();
			
			i = 1;
			while (i <= 5) {
				System.out.println("Valor = " + i);
				i++;
			}
			
			System.out.println("Deseja continuar [1]SIM/[2]Não?");
			resp = sc.nextInt();
		} while (resp == 1);
	}
}
