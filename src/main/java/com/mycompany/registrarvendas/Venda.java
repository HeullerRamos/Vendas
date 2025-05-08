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
    private LocalDate data;
    private Boolean status;
    private ArrayList<ItemVenda> itens = new ArrayList<>();


    public Venda() {
        data = LocalDate.now();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public ArrayList<ItemVenda> adicionarItens (ItemVenda item){
        
        itens.add(item);
        return itens;
    }
    
}
