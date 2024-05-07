package capitulo7.polimorfismo;

public class C07Ex16 {

	public static void main(String[] args) {
		
		Area area = new Area();
		
		System.out.println(
				  "\nÁrea do Quadrado..: " + area.calcularArea(5)
				+ "\nÁrea do Cubo......: " + area.calcularArea(5,6,7)
				+ "\nÁrea do Cilindro..: " + area.calcularArea(7,3)
	    );

	}

}
