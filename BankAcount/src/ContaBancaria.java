public abstract class ContaBancaria implements Conta{
    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = 0.00;
    }

    @Override
    public void mostrarSaldo() {
        System.out.printf("O saldo atual é R$%.2f", saldo);
        System.out.println();
    }

    @Override
    public abstract void depositar(double valor);
}

