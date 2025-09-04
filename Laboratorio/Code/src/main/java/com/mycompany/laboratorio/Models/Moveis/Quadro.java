package com.mycompany.laboratorio.Models.Moveis;

import com.mycompany.laboratorio.Models.Marca;
import com.mycompany.laboratorio.Models.Enums.Superficie;

public class Quadro extends Movel{
    
    public Quadro(int altura, int comprimento, String cor, int largura, Marca marca, String material, Superficie superficie) {
        super(altura, comprimento, cor, largura, marca, material, superficie);
    }
    
}
