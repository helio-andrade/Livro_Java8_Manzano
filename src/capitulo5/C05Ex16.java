package capitulo5;

public class C05Ex16 {

	public static void main(String[] args) {
		String hexstr = "A";
		int inteiro;
		
		inteiro = Integer.valueOf(hexstr, 16).intValue();
		
		System.out.println("Valor = " + inteiro);

	}

}
