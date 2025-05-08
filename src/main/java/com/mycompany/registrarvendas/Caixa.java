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
public class Caixa {
    private Long Id;
    private String nome;
    public ArrayList<Venda> vendas = new ArrayList<>();
    
    public Caixa(Long Id, String nome) {
        this.Id = Id;
        this.nome = nome;
    }
     public Caixa() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Venda> insereVendas(Venda venda){
        vendas.add(venda);
        venda.setStatus(true);
        return vendas;
    }
     
    
}
