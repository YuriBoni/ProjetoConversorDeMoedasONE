package Modulos;

public class Moeda {
    private String moedaBase;
    private String moedaAlvo;
    private String resultadoConversao;
    private String taxaDeConversao;

    public Moeda (LeitorApi moeda) {
        this.moedaBase = moeda.base_code();
        this.moedaAlvo = moeda.target_code();
        this.resultadoConversao = moeda.conversion_result();
        this.taxaDeConversao = moeda.conversion_rate();
    }

    public String getMoedaBase() {
        return moedaBase;
    }

    public String getMoedaAlvo() {
        return moedaAlvo;
    }

    public String getResultadoConversao() {
        return resultadoConversao;
    }

    public String getTaxaDeConversao() {
        return taxaDeConversao;
    }

    @Override
    public String toString() {
        return "Moeda base: " + moedaBase + ", Moeda alvo: " + moedaAlvo + ", Resultado da conversao: " + resultadoConversao;
    }
}
