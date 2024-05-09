package capitulo7.sobrecarga;

import java.util.Scanner;

public class C07Ex18 {
    public static void main(String[] args) {
        String valor;
        long n1;
        double n2;
        int n3;

        Scanner input = new Scanner(System.in);

        System.out.println("\nDigite um valor: ");
        valor = input.nextLine();

        n1 = Long.valueOf(valor).longValue();
        System.out.println("Área - Quadrado ..: " + calcularArea(n1));
        n3 = Integer.valueOf(valor).intValue();
        System.out.println("Área - Cubo ......: " + calcularArea(n3, n3, n3));
        n2 = Float.valueOf(valor).floatValue();
        System.out.println("Área - Cilindro ..: " + calcularArea(n2, n2));
        
        input.close();
    }

    public static long calcularArea(long lado) {
        long area = (long) lado * lado;
        return area;
    }

    public static double calcularArea(double n2, double n22) {
        double area = n2 * n2 * Math.PI * n22;
        return area;
    }

    public static int calcularArea(int comprimento, int largura, int altura) {
        int area = comprimento * largura * altura;
        return area;
    }
}
