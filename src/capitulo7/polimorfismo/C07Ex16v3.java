package capitulo7.polimorfismo;

public class C07Ex16v3 {

    public static void main(String[] args) {
        
    	// Calcula as áreas
        long areaQuadrado = Area.calcularArea(5);
        int areaCubo = Area.calcularArea(5, 6, 7);
        double areaCilindro = Area.calcularArea(7, 3);

        // Cria a string de saída formatada
        String saida = String.format(
        		"""
                  Área do Quadrado..: %d m²
                  Área do Cubo......: %d m²
                  Área do Cilindro..: %.4f m²
                """, areaQuadrado, areaCubo, areaCilindro);

        // Exibe a saída
        System.out.println(saida);
    }
}
