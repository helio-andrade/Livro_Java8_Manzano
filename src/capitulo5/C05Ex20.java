package capitulo5;

public class C05Ex20 {

	public static void main(String[] args) {
		int inteiro = 64;
		String binstr;
		
		// binstr = Integer.toBinaryString(inteiro);
		binstr = Integer.toString(inteiro, 2);
		
		System.out.println("Valor = " + binstr);
	}

}
