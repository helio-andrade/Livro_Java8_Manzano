package capitulo5;

public class C05Ex17 {

	public static void main(String[] args) {
	    String	binStr = "1010";
	    int inteiro;
	    
	    inteiro = Integer.valueOf(binStr, 2).intValue();
	    
	    System.out.println("Valor = " + inteiro);

	}

}
