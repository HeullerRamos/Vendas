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
    
//public ArrayList<Produto> produtos = new ArrayList<>();
    
    
//    public ArrayList<Produto> adicionarItens (Produto produto){
//        
//        produtos.add(produto);
//        quantidade = produtos.size();
//        return produtos;
//    }

    public ItemVenda(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }
    
    
}
