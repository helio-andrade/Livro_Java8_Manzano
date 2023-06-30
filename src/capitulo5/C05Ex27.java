/*
 * Conversão de String para long
 * */

package capitulo5;

public class C05Ex27 {
	public static void main(String[] args) {
		String str = "10";
		long longo;
		
		// longo = Long.valueOf(str).longValue();
		longo = Long.parseLong(str);
		
		System.out.println("Valor = " + longo);
	}
}
