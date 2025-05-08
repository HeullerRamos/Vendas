package com.mycompany.registrarvendas;

public class VendaControler {


    public  Venda adicionarItensVenda(ItemVenda item) {
        Venda venda =  new Venda();

        venda.adicionarItens(item);

        return venda;
    }
}
