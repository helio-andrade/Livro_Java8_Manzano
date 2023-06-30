/*
 * Conversão de String para float
 * 
 * */

package capitulo5;

public class C05Ex25 {
	public static void main(String[] args) {
		String str = "10";
		float valor;
		
		valor = Float.valueOf(str).floatValue();
				
		System.out.println("Valor = " + valor);
	}
}
