package com.mycompany.laboratorio.Models;

public class Marca {
    private static int contadorId;
    private final int id;
    private String nome;
    private String endereco;
    private String setor;

    public Marca(String nome, String endereco, String setor) {
        this.id = contadorId++;
        this.nome = nome;
        this.endereco = endereco;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    public static void main(String[] args){
        System.out.println("sm,.cçndçsj lç");
    }
}
