package com.br.codigos.michelle;

/**
 * CLASSE ENDEREÇO, A CLASSE QUE IRA SETAR E ARMAZENAR OS ENDEREÇOS DOS USUÁRIOS.
 */
public class Endereco {

    private String rua;
    private String numero;
    private String bairro;
    private String estado;
    private String cidade;

    public Endereco(String rua, String numero, String bairro, String estado, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", bairro='" + bairro + '\'' +
                ", estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }

    public void cadastrarEndereco(){}

    public void removerEndereco(){}
}
