package com.mycompany.laboratorio.Models.Moveis;

import com.mycompany.laboratorio.Models.Enums.Superficie;
import com.mycompany.laboratorio.Models.Marca;

public class Relogio extends Movel{
    
    public Relogio(int altura, int comprimento, String cor, int largura, Marca marca, String material, Superficie superficie) {
        super(altura, comprimento, cor, largura, marca, material, superficie);
    }
    
}
