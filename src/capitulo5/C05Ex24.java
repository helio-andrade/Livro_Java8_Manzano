package capitulo5;

public class C05Ex24 {

	public static void main(String[] args) {
		String str = "10.89";
		double valor;
		
		// valor = Double.valueOf(str).doubleValue();
		valor = Double.parseDouble(str);
		
		System.out.println("Valor = " + valor);	

	}

}
