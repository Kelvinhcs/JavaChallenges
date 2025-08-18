public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        double onePercent = valor/100;
        System.out.printf("O valor de %.2f foi selecionado", valor);
        System.out.println();
        System.out.println("Devido as nossas regras de investimento, 1% de seu depósito foi descontado");
        System.out.printf("R$%.2f foi descontado de seu depósito resultando em R$%.2f",onePercent, valor-onePercent);
        saldo += valor-onePercent;

    }
}