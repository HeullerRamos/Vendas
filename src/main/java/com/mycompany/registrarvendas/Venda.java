/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrarvendas;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author IFNMG
 */
public class Venda {
    public LocalDate data; 
    public Boolean status;
    
    
    public ArrayList<ItemVenda> itens = new ArrayList<>();

    public Venda() {
        data = LocalDate.now();
    }
    
    
    
    public ArrayList<ItemVenda> adicionarItens (ItemVenda item){
        
        itens.add(item);
        return itens;
    }
    
}
