package capitulo7;

public class C07Ex09 {
	static int x = 1;
	
	public static void main(String[] args) {
		int y = 0;
		
		System.out.println("Saída do Programa Principal");
		System.out.println("x = " + x +
						   "\ny = " + y);
		
		x++;
		y++;
		
		calcular();
	}
	
	public static void calcular() {
		int y = 99;
		
		System.out.println("Saída do Método calcular()");
		System.out.println("x = " + x +
				   		   "\ny = " + y);
		
		x++;
		y++;
		
		System.out.println("x = " + x +
						   "\ny = " + y);
	}
}
