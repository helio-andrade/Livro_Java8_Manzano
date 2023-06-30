/*
 * Conversão de String para integer	
 * 
 * */

package capitulo5;

public class C05Ex26 {
	public static void main(String[] args) {
		String str = "10";
		int inteiro;
		
		// inteiro = Integer.valueOf(str).intValue();
		inteiro = Integer.parseInt(str);
		
		System.out.println("Valor = " + inteiro);
	}
}
