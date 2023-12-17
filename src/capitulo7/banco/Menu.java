package capitulo7.banco;

import java.util.Scanner;

public class Menu {
    private ContaCorrente contaCorrente;
    private Scanner input;

    public Menu(ContaCorrente contaCorrente, Scanner input) {
        this.contaCorrente = contaCorrente;
        this.input = input;
    }

    public void exibirMenu() {
        int opcao = 0;
        while (opcao != 4) {
            exibirOpcoes();
            opcao = input.nextInt();
            executarOpcao(opcao);
        }
    }

    private void exibirOpcoes() {
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Realizar saque");
        System.out.println("2 - Realizar depósito");
        System.out.println("3 - Verificar saldo");
        System.out.println("4 - Sair");
    }

    private void executarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                realizarSaque();
                break;

            case 2:
                realizarDeposito();
                break;

            case 3:
                verificarSaldo();
                break;

            case 4:
                System.out.println("Saindo do programa. Obrigado!");
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }

    private void realizarSaque() {
        System.out.print("Digite o valor do saque: ");
        double saque = input.nextDouble();
        contaCorrente.sacar(saque);
    }

    private void realizarDeposito() {
        System.out.print("Digite o valor do depósito: ");
        double deposito = input.nextDouble();
        contaCorrente.depositar(deposito);
    }

    private void verificarSaldo() {
        System.out.println("Saldo atual: R$ " + contaCorrente.consultarSaldo());
    }
}
