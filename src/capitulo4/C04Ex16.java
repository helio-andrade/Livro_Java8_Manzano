package capitulo4;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C04Ex16 {
	public static void main(String[] args) {
		
		int dividendo, divisor, quociente;
		
		System.out.println("\nInforme um valor do dividendo: ");
		try {
			BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
			dividendo = Integer.parseInt(br.readLine());
		} 
		catch (Exception e) {
			dividendo = 0;
		}
		
		System.out.println("\nInforme um valor do divisor: ");
		try {
			BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
			divisor = Integer.parseInt(br.readLine());
		} 
		catch (Exception e) {
			divisor = 0;
		}
		
		try{
			quociente = dividendo / divisor;
			if (divisor == 0)
				throw new Exception();
			
			System.out.println("Resultado = " + quociente);
		}
		catch(Exception e){
			System.out.println("Erro de divisão por ZERO.");
		}
		
		finally {
			System.out.println("Passei pelo bloco: finally.");
		}
		
	}
}
