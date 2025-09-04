package com.mycompany.laboratorio.Models.Moveis;

import com.mycompany.laboratorio.Models.Marca;
import com.mycompany.laboratorio.Models.Objeto;
import com.mycompany.laboratorio.Models.Enums.Superficie;

public class Movel extends Objeto{
    
    public Movel(int altura, int comprimento, String cor, int largura, Marca marca, String material, Superficie superficie) {
        super(altura, comprimento, cor, largura, marca, material, superficie);
    }
    
}
