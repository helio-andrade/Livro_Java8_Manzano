package capitulo7;

public class C07Ex09v2 {
    static int x = 1;

    public static void main(String[] args) {
        int y = 0;

        System.out.println("Saída do Programa Principal");
        imprimirValores(x, y);

        x++;
        y++;

        calcular();
    }

    public static void calcular() {
        int y = 99;

        System.out.println("Saída do Método calcular()");
        imprimirValores(x, y);

        x++;
        y++;

        imprimirValores(x, y);
    }

    private static void imprimirValores(int x, int y) {
        System.out.println("x = " + x + "\ny = " + y);
    }
}
