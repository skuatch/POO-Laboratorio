package com.mycompany.laboratorio.Models.Moveis;

import com.mycompany.laboratorio.Models.Enums.Estofado;
import com.mycompany.laboratorio.Models.Marca;
import com.mycompany.laboratorio.Models.Enums.Superficie;

public class Cadeira extends Movel{
    
    private int quantidadeDePes;
    private Estofado estofado;
    
    public Cadeira(int altura, int comprimento, String cor, int largura, Marca marca, String material, Superficie superficie, int quantidadeDePes, Estofado estofado) {
        super(altura, comprimento, cor, largura, marca, material, superficie);
        this.quantidadeDePes = quantidadeDePes;
        this.estofado = estofado;
    }

    public int getQuantidadeDePes() {
        return quantidadeDePes;
    }

    public void setQuantidadeDePes(int quantidadeDePes) {
        this.quantidadeDePes = quantidadeDePes;
    }

    public Estofado getEstofado() {
        return estofado;
    }

    public void setEstofado(Estofado estofado) {
        this.estofado = estofado;
    }
    
}
