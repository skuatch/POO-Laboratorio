package com.mycompany.laboratorio.Models.Eletronicos;

import com.mycompany.laboratorio.Models.Marca;
import com.mycompany.laboratorio.Models.Objeto;
import com.mycompany.laboratorio.Models.Enums.Superficie;

public class Eletronico extends Objeto{
    
    private boolean estado;
    
    public Eletronico(int altura, int comprimento, String cor, int largura, Marca marca, String material, Superficie superficie) {
        super(altura, comprimento, cor, largura, marca, material, superficie);
        this.estado = false;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
