package com.br.codigos.michelle;

/**
 * CLASSE FORMA PAGAMENTO, ONDE IREMOS SETAR DIFERENTES FORMAS DE PAGAMENTO E DISPONIBILZAR PARA O USUARÍO.
 */
public class FormaPagamento {

    private long numCartao;
    private String nomeCartao;
    private float dinheiro;

    public FormaPagamento(long numCartao, String nomeCartao, float dinheiro) {
        this.numCartao = numCartao;
        this.nomeCartao = nomeCartao;
        this.dinheiro = dinheiro;
    }

    public long getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(long numCartao) {
        this.numCartao = numCartao;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" +
                "numCartao=" + numCartao +
                ", nomeCartao='" + nomeCartao + '\'' +
                ", dinheiro=" + dinheiro +
                '}';
    }

    public void cadastrarPagamento(){}

    public void removerPagamento(){}
}
