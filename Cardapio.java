package com.br.codigos.michelle;

/**
 * CLASSE CARDAPIO, ONDE IREMOS SETAR OS PRODUTOS DISPONÍVEIS NA APLICAÇÃO.
 */
public class Cardapio {

    private  String itens;

    public Cardapio(String itens) {
        this.itens = itens;
    }

    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Cardapio{" +
                "itens='" + itens + '\'' +
                '}';
    }

    public void cadastrarItem(){}

    public void removerItem(){}
}
