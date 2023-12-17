package capitulo7.banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(contaCorrente, scanner);
        menu.exibirMenu();
        scanner.close();
    }
}
