package com.br.codigos.michelle;

/**
 * CLASSE RESTAURANTE, ONDE SERÁ SETADO OS DADOS DO MESMO.
 */
public class Restaurante {

    private String nomeRestaurante;
    private String telefoneRestaurante;

    public Restaurante(String nomeRestaurante, String telefoneRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
        this.telefoneRestaurante = telefoneRestaurante;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getTelefoneRestaurante() {
        return telefoneRestaurante;
    }

    public void setTelefoneRestaurante(String telefoneRestaurante) {
        this.telefoneRestaurante = telefoneRestaurante;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nomeRestaurante='" + nomeRestaurante + '\'' +
                ", telefoneRestaurante='" + telefoneRestaurante + '\'' +
                '}';
    }

    public void cadastrarRestaurante(){}

    public void removerRestaurante(){}
}
