package com.mycompany.laboratorio.Models.Eletronicos;

import com.mycompany.laboratorio.Models.Enums.Superficie;
import com.mycompany.laboratorio.Models.Marca;

public class Teclado extends Eletronico{
    
    private String padraoDeLinguagem;
    
    public Teclado(int altura, int comprimento, String cor, int largura, Marca marca, String material, Superficie superficie, String padraoDeLinguagem) {
        super(altura, comprimento, cor, largura, marca, material, superficie);
        this.padraoDeLinguagem = padraoDeLinguagem;
    }

    public String getPadraoDeLinguagem() {
        return padraoDeLinguagem;
    }

    public void setPadraoDeLinguagem(String padraoDeLinguagem) {
        this.padraoDeLinguagem = padraoDeLinguagem;
    }
    
}
