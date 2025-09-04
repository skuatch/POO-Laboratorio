package com.mycompany.laboratorio.Models.Moveis;

import com.mycompany.laboratorio.Models.Enums.Superficie;
import com.mycompany.laboratorio.Models.Marca;

public class Cabo extends Movel{
    
    private String tipoEntrada;
    private String tipoSaida;
    
    public Cabo(int altura, int comprimento, String cor, int largura, Marca marca, String material, Superficie superficie, String tipoEntrada, String tipoSaida) {
        super(altura, comprimento, cor, largura, marca, material, superficie);
        this.tipoEntrada = tipoEntrada;
        this.tipoSaida = tipoSaida;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getTipoSaida() {
        return tipoSaida;
    }

    public void setTipoSaida(String tipoSaida) {
        this.tipoSaida = tipoSaida;
    }
    
}
