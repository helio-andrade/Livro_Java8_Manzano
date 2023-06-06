package capitulo5;

public class C05Ex04 {

	public static void main(String[] args) {
		String TEXTO1 = "PROGRAMACAO COM JAVA";
		String TEXTO2 = "programacao com java";
		
		System.out.println();
		
		if(TEXTO1.equals(TEXTO2))
			System.out.println("Os textos são iguais!");
		else
			System.out.println("Os textos são diferentes!");
		
		if(TEXTO1.equalsIgnoreCase(TEXTO2))
			System.out.println("Os textos são iguais!");
		else
			System.out.println("Os textos são diferentes!");
	}

}
