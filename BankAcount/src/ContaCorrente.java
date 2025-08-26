/*Criação de conta-corrente:
* Herda da classe "ContaBancaria" atributos principais e implementa métodos novos
* tabelaTarifas: valor que segue o Enum "TabelaTarifas" para identificar as regras e valores de tarifas mensais
* limiteChequeEspecial (opcional): valor referente ao limite disponível para o cheque especial do cliente
* */
public class ContaCorrente extends ContaBancaria{
    private final double limiteChequeEspecial;
    private final TabelaTarifas tabelaTarifas;

    /*Implementação do Builder da classe mãe:
    * feito para adicionar o Builder original da classe herdada,
    * e também implementar os parâmetros novos da classe
    * */
    private ContaCorrente(Builder builder){
        super(builder);
        this.limiteChequeEspecial = builder.limiteChequeEspecial;
        this.tabelaTarifas = builder.tabelaTarifas;
    }
    //Parâmetros novos são gerados aqui neste Builder
    public static class Builder extends ContaBancaria.Builder<Builder> {
        private double limiteChequeEspecial = 0;
        private TabelaTarifas tabelaTarifas;

        public Builder(String titular, double saldo, TabelaTarifas tabelaTarifas){
            super(titular, saldo);
            this.tabelaTarifas = tabelaTarifas;
        }
        public Builder limiteChequeEspecial(double limiteChequeEspecial){
            this.limiteChequeEspecial = limiteChequeEspecial;
            return this;
        } public Builder tabelaTarifas(TabelaTarifas tabelaTarifas){
            this.tabelaTarifas = tabelaTarifas;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        /*Override da classe build herdada:
        * altera o Build original para que ao ser chamado ele referenciar o criado neste arquivo
        * */
        @Override
        public ContaCorrente build(){
            return new ContaCorrente(this);
        }
    }

    //Override clássico no toString para mostrar de maneira melhor as funcionalidades
    @Override
    public String toString() {
        return  "Titular - " + titular + "\n" +
                "Saldo - R$" + saldo + "\n" +
                "Limite Cheque Especial - " + limiteChequeEspecial + "\n" +
                "Tabela de Tarifas - " + tabelaTarifas;
    }
}
