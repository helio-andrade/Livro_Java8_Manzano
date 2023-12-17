package capitulo7;

import java.util.Scanner;

public class C07Ex08 {
    static class ContaCorrente {
        private double saldo;

        public void sacar(double valor) {
            if (valor > saldo) {
                System.out.println("Saldo insuficiente. Saque não realizado.");
            } else {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
            }
        }

        public void depositar(double valor) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        }

        public double consultarSaldo() {
            return saldo;
        }
    }

    static class Menu {
        private static ContaCorrente contaCorrente = new ContaCorrente();
        private static Scanner input = new Scanner(System.in);

        public static void exibirMenu() {
            int opcao = 0;
            while (opcao != 4) {
                System.out.println("Selecione uma opção:");
                System.out.println("1 - Realizar saque");
                System.out.println("2 - Realizar depósito");
                System.out.println("3 - Verificar saldo");
                System.out.println("4 - Sair");

                opcao = input.nextInt();

                executarOpcao(opcao);
            }
        }

        private static void executarOpcao(int opcao) {
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

        private static void realizarSaque() {
            System.out.print("Digite o valor do saque: ");
            double saque = input.nextDouble();
            contaCorrente.sacar(saque);
        }

        private static void realizarDeposito() {
            System.out.print("Digite o valor do depósito: ");
            double deposito = input.nextDouble();
            contaCorrente.depositar(deposito);
        }

        private static void verificarSaldo() {
            System.out.println("Saldo atual: R$ " + contaCorrente.consultarSaldo());
        }
    }

    public static void main(String[] args) {
        Menu.exibirMenu();
    }
}
