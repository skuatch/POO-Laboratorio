package com.mycompany.laboratorio.Models.Eletronicos;

import com.mycompany.laboratorio.Models.Enums.Superficie;
import com.mycompany.laboratorio.Models.Marca;

public class Monitor extends Eletronico{
    
    private int numeroPolegadas;
    
    public Monitor(int altura, int comprimento, String cor, int largura, Marca marca, String material, Superficie superficie, int numeroPolegadas) {
        super(altura, comprimento, cor, largura, marca, material, superficie);
        this.numeroPolegadas = numeroPolegadas;
    }

    public int getNumeroPolegadas() {
        return numeroPolegadas;
    }

    public void setNumeroPolegadas(int numeroPolegadas) {
        this.numeroPolegadas = numeroPolegadas;
    }
    
}
