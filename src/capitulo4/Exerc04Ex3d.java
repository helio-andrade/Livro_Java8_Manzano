package capitulo4;

public class Exerc04Ex3d {

    public static void main(String[] args) {
        System.out.println("Utilizando for:");
        for (int i = 1; i < 30; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\nUtilizando while:");
        int i = 1;
        while (i < 30) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
            i++;
        }

        System.out.println("\nUtilizando do/while:");
        i = 1;
        do {
            if (i % 4 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i < 30);
    }
}
