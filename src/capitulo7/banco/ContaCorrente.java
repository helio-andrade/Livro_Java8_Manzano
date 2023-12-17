package capitulo7.banco;

public class ContaCorrente {
    private double saldo;

    public ContaCorrente() {
        this.saldo = 0.0;
    }

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
