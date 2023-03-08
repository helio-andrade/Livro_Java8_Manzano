package capitulo4;

public class Exerc04Ex3e {

    public static void main(String[] args) {
        System.out.println("Utilizando for:");
        int somaFor = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                somaFor += i;
            }
        }
        System.out.println("Soma: " + somaFor);

        System.out.println("\nUtilizando while:");
        int somaWhile = 0;
        int i = 1;
        while (i <= 50) {
            if (i % 2 == 0) {
                somaWhile += i;
            }
            i++;
        }
        System.out.println("Soma: " + somaWhile);

        System.out.println("\nUtilizando do/while:");
        int somaDoWhile = 0;
        i = 1;
        do {
            if (i % 2 == 0) {
                somaDoWhile += i;
            }
            i++;
        } while (i <= 50);
        System.out.println("Soma: " + somaDoWhile);
    }
}
