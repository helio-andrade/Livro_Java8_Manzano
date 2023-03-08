package capitulo4;

public class Exerc04Ex3c {

    public static void main(String[] args) {
        System.out.println("Utilizando for:");
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }

        System.out.println("\nUtilizando while:");
        int i = 1;
        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }

        System.out.println("\nUtilizando do/while:");
        i = 1;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= 20);
    }
}
