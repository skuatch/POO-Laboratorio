package com.mycompany.laboratorio.Models.Moveis;

import com.mycompany.laboratorio.Models.Enums.Estofado;
import com.mycompany.laboratorio.Models.Enums.Superficie;
import com.mycompany.laboratorio.Models.Marca;

public class Mesa extends Movel{
    
    private int quantidadeDePes;
    
    public Mesa(int altura, int comprimento, String cor, int largura, Marca marca, String material, Superficie superficie, int quantidadeDePes) {
        super(altura, comprimento, cor, largura, marca, material, superficie);
        this.quantidadeDePes = quantidadeDePes;
    }

    public int getQuantidadeDePes() {
        return quantidadeDePes;
    }

    public void setQuantidadeDePes(int quantidadeDePes) {
        this.quantidadeDePes = quantidadeDePes;
    }
    
}
