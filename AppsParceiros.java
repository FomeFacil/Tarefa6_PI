package com.br.codigos.michelle;

/**
 * CLASSE APPS PARCEIROS, ONDE IREMOS INDENTIFICAR E INTERLIGAR APPS PARCEIROS COM A NOSSA APLICAÇÃO.
 */
public class AppsParceiros {

    private String nomeAppsParceiros;

    public AppsParceiros(String nomeAppsParceiros) {
        this.nomeAppsParceiros = nomeAppsParceiros;
    }

    public String getNomeAppsParceiros() {
        return nomeAppsParceiros;
    }

    public void setNomeAppsParceiros(String nomeAppsParceiros) {
        this.nomeAppsParceiros = nomeAppsParceiros;
    }

    @Override
    public String toString() {
        return "AppsParceiros{" +
                "nomeAppsParceiros='" + nomeAppsParceiros + '\'' +
                '}';
    }
}
