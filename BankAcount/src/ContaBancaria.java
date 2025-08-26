/*Classe Base para criação de contas bancárias gerais
* criada com o intuito de manter a base para todos os parâmetros em comum a todas as contas PF geradas
* a primeiro momento o sistema de PJ não foi implementado, potencialmente podendo ser utilizada para isso também
* */
public abstract class ContaBancaria implements Conta{
    protected final String titular;
    protected final double saldo;

    /*Implementação do Builder generic:
    faz a base para a implementação obrigatória deste builder caso a classe seja herdada*/
    protected ContaBancaria(Builder<?> builder){
        this.titular = builder.titular;
        this.saldo = builder.saldo;
    }

    public abstract static class Builder<T extends Builder<T>>{
        private final String titular;
        private final double saldo;

        /*Define ambos os parâmetros como obrigatórios*/
        public Builder(String titular, double saldo){
            this.titular = titular;
            this.saldo = saldo;
        }
        protected abstract T self(); //Define o generic como ele mesmo para evitar erros
        public abstract ContaBancaria build();

    }

    //Override obrigatório dos métodos herdados da interface "Conta"
    @Override
    public double consultarSaldo() {
        return 0;
    }
    @Override
    public void depositar(double valorDeposito) {
    }

    //Override clássico no toString para mostrar de maneira melhor as funcionalidades
    @Override
    public String toString() {
        return  "Titular - " + titular + '\n' +
                "Saldo - R$" + saldo;
    }
}
