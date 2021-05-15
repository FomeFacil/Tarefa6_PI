package com.br.codigos.michelle;


/**
 * CLASSE APP, A PRINCIPAL CLASSE DE NOSSA APLICACÃO,
 * POIS ELA IRÁ GERENCIAR E ESTABELECER A COMUNICAÇÃO
 * COM O RESTO DA APLICAÇÃO.
 */
public class App {



    private String promocoes;
    private AppsParceiros parceiros;

    public App(String promocoes, AppsParceiros parceiros) {
        this.promocoes = promocoes;
        this.parceiros = parceiros;
    }

    public String getPromocoes() {
        return promocoes;
    }

    public void setPromocoes(String promocoes) {
        this.promocoes = promocoes;
    }

    public AppsParceiros getParceiros() {
        return parceiros;
    }

    public void setParceiros(AppsParceiros parceiros) {
        this.parceiros = parceiros;
    }

    @Override
    public String toString() {
        return "App{" +
                "promocoes='" + promocoes + '\'' +
                ", parceiros=" + parceiros +
                '}';
    }

    public void pesquisarItem(){}

    public void pesquisarRestaurante(){}

    public void  fazerPedido(){}

    public void cancelarPedido(){}

    public void operation16(){}

    public void redirecionarCompra(){}
}
