package capitulo4;
import java.util.Scanner;

public class C04Ex18 {
	public static void main(String[] args) {
		int i, resp;
		
		Scanner sc = new Scanner(System.in);
	    
		resp = 1;
		while (resp == 1) {
			System.out.println();
			
			i = 1;
			while (i <= 5) {
				System.out.println("Valor = " + i);
				i++;
			}
			
			System.out.println("Deseja continuar [1]SIM/[2]Não?");
			resp = sc.nextInt();
		}
		
		sc.close();
	}
}
