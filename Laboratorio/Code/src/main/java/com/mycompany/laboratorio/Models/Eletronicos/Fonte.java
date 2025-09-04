package com.mycompany.laboratorio.Models.Eletronicos;

import com.mycompany.laboratorio.Models.Enums.Superficie;
import com.mycompany.laboratorio.Models.Marca;

public class Fonte extends Eletronico{
    
    private int numeroVoltagem;
    
    public Fonte(int altura, int comprimento, String cor, int largura, Marca marca, String material, Superficie superficie, int numeroVoltagem) {
        super(altura, comprimento, cor, largura, marca, material, superficie);
        this.numeroVoltagem = numeroVoltagem;
    }

    public int getNumeroVoltagem() {
        return numeroVoltagem;
    }

    public void setNumeroVoltagem(int numeroVoltagem) {
        this.numeroVoltagem = numeroVoltagem;
    }

}
