/* 
 * Extração de código ASCII de uma sequência de caracteres
 * (de String para código ASCII)
 * 
 * */
package capitulo5;

public class C05Ex13v2 {
    public static void main(String[] args) {
        String str = "ESTUDO DE JAVA";

        System.out.println("Caracteres:");
        for (char caractere : str.toCharArray()) {
            System.out.println(caractere);
        }

        System.out.println("Valores ASCII:");
        for (char caractere : str.toCharArray()) {
            int seqASCII = (int) caractere;
            System.out.println(seqASCII);
        }
    }
}
