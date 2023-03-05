package capitulo4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class C04Ex02 {

	public static void main(String[] args) {
		String nome="";
		int idade=0;
		float altura=0;
		
		DecimalFormat df = new DecimalFormat();
		
		System.out.println();
		System.out.print("Digite seu nome ....: ");
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			nome  = br.readLine();
		} catch (Exception e) {
			nome = "";
		}
		
		System.out.print("Digite sua idade ....: ");
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			idade  = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			idade = 0;
		}
		
		System.out.print("Digite sua altura ....: ");
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			altura  = Float.parseFloat(br.readLine());
		} catch (Exception e) {
			altura = 0;
		}
		
		System.out.println("Nome....: " + nome);
		System.out.println("Idade ..: "	+ idade + " anos");
		df.applyPattern("0.00");
		System.out.println("Altura .: " + df.format(altura) + " m");
	}

}
