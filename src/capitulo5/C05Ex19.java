package capitulo5;

public class C05Ex19 {

	public static void main(String[] args) {
		int inteiro = 11;
		String hexstr;
		
		hexstr = Integer.toString(inteiro, 16).toUpperCase();
		
		System.out.println("Valor = " + hexstr);

	}

}
