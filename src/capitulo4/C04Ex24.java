package capitulo4;
import java.util.Scanner;

public class C04Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPrograma: TABUADA");
        System.out.println("\nDigite um valor inteiro para cálculo: ");
        int n = scanner.nextInt();

        System.out.println("\nTabuada de " + n + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = n * i;
            System.out.printf("%d x %d = %d\n", n, i, resultado);
        }

        scanner.close();
    }
}
