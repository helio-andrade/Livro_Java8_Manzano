package capitulo6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.IOException;

public class C06Ex02 {
    private static final Scanner input = new Scanner(System.in);
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    

    public static void main(String[] args) {
        byte opcao;

        String menu = "\n"
                + "--------------------------\n"
                + "PROGRAMA CALCULADORA\n"
                + "Menu Principal\n"
                + "--------------------------\n"
                + "[1] ............. Adicao\n"
                + "[2] .......... Subtracao\n"
                + "[3] ...... Multiplicacao\n"
                + "[4] ............ Divisao\n"
                + "[5] ........... Encerrar\n"
                + "\nEscolha uma opcao: ";

        do {
            clearScreen();
            System.out.print(menu);
            opcao = input.nextByte();

            switch (opcao) {
                case 1:
                    rotAdicao();
                    break;
                case 2:
                    rotSubtracao();
                    break;
                case 3:
                    rotMultiplicacao();
                    break;
                case 4:
                    rotDivisao();
                    break;
                case 5:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }

            pausa();
        } while (opcao != 5);

        input.close();
    }

    private static void rotAdicao() {
        double r, a, b;

        System.out.println("\n<<< ROTINA DE ADICAO >>>\n");

        System.out.print("a = ");
        a = input.nextDouble();
        System.out.print("b = ");
        b = input.nextDouble();

        r = a + b;
        System.out.println(a + " + " + b + " = " + df.format(r));
    }

    private static void rotSubtracao() {
        double r, a, b;

        System.out.println("\n<<< ROTINA DE SUBTRACAO >>>\n");

        System.out.print("a = ");
        a = input.nextDouble();
        System.out.print("b = ");
        b = input.nextDouble();

        r = a - b;
        System.out.println(a + " - " + b + " = " + df.format(r));
    }

    private static void rotMultiplicacao() {
        double r, a, b;

        System.out.println("\n<<< ROTINA DE MULTIPLICACAO >>>\n");

        System.out.print("a = ");
        a = input.nextDouble();
        System.out.print("b = ");
        b = input.nextDouble();

        r = a * b;
        System.out.println(a + " x " + b + " = " + df.format(r));
    }

    private static void rotDivisao() {
        double r, a, b;

        System.out.println("\n<<< ROTINA DE DIVISAO >>>\n");

        System.out.print("a = ");
        a = input.nextDouble();
        System.out.print("b = ");
        b = input.nextDouble();

        if (b != 0) {
            r = a / b;
            System.out.println(a + " / " + b + " = " + df.format(r));
        } else {
            System.out.println("Divisao por zero nao permitida.");
        }
    }

    private static void clearScreen() {
        String os = System.getProperty("os.name").toLowerCase();
        ProcessBuilder processBuilder = new ProcessBuilder();

        try {
            if (os.contains("win")) {
                processBuilder.command("cmd", "/c", "cls");
            } else {
                processBuilder.command("clear");
            }

            processBuilder.inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void pausa() {
        System.out.print("\nTecle <ENTER> para continuar...");
        try {
            br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
