public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente.Builder("Waldhisney", 0, TabelaTarifas.A)
                .limiteChequeEspecial(1500)
                .build();
        System.out.println(conta);
    }
}
