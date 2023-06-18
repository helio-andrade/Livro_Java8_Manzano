/* 
 * Extração de código ASCII de uma sequência de caracteres
 * (de String para código ASCII)
 * 
 * */
package capitulo5;

public class C05Ex13 {
	public static void main(String[] args) {
		String str = "ESTUDO DE JAVA";
		int i, seqASCII;
		char caractere;
		
		for(i = 0; i < str.length(); i++) {
			caractere = str.charAt(i);
			System.out.println(" " + caractere + " ");
		}
		
		for(i = 0; i < str.length(); i++) {
			caractere = str.charAt(i);
			seqASCII = (int)caractere;
			System.out.println(" " + seqASCII + " ");
		}		
		
	}
}
