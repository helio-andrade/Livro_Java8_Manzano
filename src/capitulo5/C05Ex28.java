package capitulo5;

public class C05Ex28 {
	public static void main(String[] args) {
		String str = "10";
		byte curto;
		
		// curto = Byte.valueOf(str).byteValue();
		curto = Byte.parseByte(str);
		
		System.out.println("\nValor = " + curto);
	}
}
