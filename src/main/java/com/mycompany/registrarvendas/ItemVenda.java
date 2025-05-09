/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrarvendas;

import java.util.ArrayList;

/**
 *
 * @author IFNMG
 */
public class ItemVenda {
    private int quantidade;

    public ItemVenda() {
      
    }
    
    private Produto produto;
    


    public ItemVenda(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItemVenda{" +"Nome= " + produto.getNome() + "quantidade=" + quantidade;
    }
}
