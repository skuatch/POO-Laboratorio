package com.mycompany.laboratorio.Models;

import com.mycompany.laboratorio.Models.Enums.Superficie;

public abstract class Objeto {
    private static int contadorId;
    private final int id;
    private int largura;
    private int altura;
    private int comprimento;
    private String material;
    private Superficie superficie;
    private String cor;
    private Marca marca;

    public Objeto(int altura, int comprimento, String cor, int largura, Marca marca, String material, Superficie superficie) {
        this.id = contadorId++;
        this.altura = altura;
        this.comprimento = comprimento;
        this.cor = cor;
        this.largura = largura;
        this.marca = marca;
        this.material = material;
        this.superficie = superficie;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
