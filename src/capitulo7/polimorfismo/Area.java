package capitulo7.polimorfismo;

public class Area {
    
	public static long calcularArea(int lado) {
        long area = lado * lado;
        return area;
    }

    public static double calcularArea(float raio, float altura) {
        double area = raio * raio * Math.PI * altura;
        return area;
    }

    public static int calcularArea(int comprimento, int largura, int altura) {
        int area = comprimento * largura * altura;
        return area;
    }
}
