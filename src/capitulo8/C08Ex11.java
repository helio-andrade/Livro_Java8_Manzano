package capitulo8;

public class C08Ex11 {
	public static void main(String[] args) {
		int fatorial = 1, i = 1, numero;
		
		numero = Integer.parseInt(args[0]);
		
		for (i = 1; i <= numero; i++)
			fatorial *= i;
		
		System.out.println(fatorial);
	}
}
