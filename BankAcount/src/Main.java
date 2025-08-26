public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente.Builder("Waldhisney", 0, TabelaTarifas.A)
                .limiteChequeEspecial(1500)
                .build();
        System.out.println(conta);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(conta.depositar(298.45));
        System.out.println(conta);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(conta.depositar(500.78));
        System.out.println(conta);
        System.out.println("O limite de Cheque Especial é: R$" + conta.getLimiteChequeEspecial());
        System.out.println("Você tem o produto -> " + conta.getTabelaTarifas());
    }
}
