package com.mycompany.laboratorio.Models.Gerenciamento;

import java.io.Console;

public class Menu {

    public static void MostrarMenu() {
        var gerenciador = new GerenciadorInventario();
        var option = 1;
        while (option != 0) {
            System.out.println("+----------- MENU DE INVENTARIO -----------+");
            System.out.println("|---  1 - Cadastrar Inventário        -----|");
            System.out.println("|---  2 - Alterar Inventário          -----|");
            System.out.println("|---  3 - Remover Inventário          -----|");
            System.out.println("|---  4 - Consultar Inventário        -----|");
            System.out.println("|---  0 - Sair                        -----|");
            System.out.println("+------------------------------------------+");
            System.con
            var input = System.console().readLine();
            option = input.isBlank() ? Integer.MAX_VALUE : Integer.parseInt(input);
            switch (option) {
                case 1:
                    gerenciador.MostrarMenuCadastro();
                    break;
                case 2:
                    gerenciador.MostrarMenuAlteracao();
                    break;
                case 3:
                    gerenciador.MostrarMenuRemocao();
                    break;
                case 4:
                    gerenciador.MostrarMenuConsulta();
                    break;
                default:
                    break;
            }
        }

    }
}
