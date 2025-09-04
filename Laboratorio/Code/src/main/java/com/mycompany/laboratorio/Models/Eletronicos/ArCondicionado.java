package com.mycompany.laboratorio.Models.Eletronicos;

import com.mycompany.laboratorio.Models.Enums.Superficie;
import com.mycompany.laboratorio.Models.Marca;

public class ArCondicionado extends Eletronico{
    
    public ArCondicionado(int altura, int comprimento, String cor, int largura, Marca marca, String material, Superficie superficie) {
        super(altura, comprimento, cor, largura, marca, material, superficie);
    }
    
}
