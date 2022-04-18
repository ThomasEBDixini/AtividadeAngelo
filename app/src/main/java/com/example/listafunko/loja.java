package com.example.listafunko;

public class loja {
    private String nome;
    private String aplicativo;

    public loja(String nome, String aplicativo) {
        this.nome = nome;
        this.aplicativo = aplicativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAplicativo() {
        return aplicativo;
    }

    public void setAplicativo(String aplicativo) {
        this.aplicativo = aplicativo;
    }
}
