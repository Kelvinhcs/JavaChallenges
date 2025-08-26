public enum TabelaTarifas {
    S("Tarifa Premium", 49.99),
    A("Tarifa Avançada", 24.99),
    B("Tarifa Intermediária", 29.99),
    C("Tarifa Básica", 19.99);

    private final String descricao;
    private final double valor;

    TabelaTarifas(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return descricao + " - R$" + valor;
    }
}

