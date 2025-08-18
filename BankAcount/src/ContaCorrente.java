public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        System.out.printf("O valor de %.2f foi depositado",valor);
        System.out.println();
        saldo += valor;
    }

    public String toString(){
        return "Objeto conta corrente que precisa de um valor de depósito inicial e declarar se a conta é conjunta ou não";
    }
}
