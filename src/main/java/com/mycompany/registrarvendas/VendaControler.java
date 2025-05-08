package com.mycompany.registrarvendas;

public class VendaControler {
    private Venda venda;

    public VendaControler() {
        venda = new Venda();
    }

    public  Venda adicionarItensVenda(ItemVenda item) {

        venda.adicionarItens(item);

        return venda;
    }

    public Venda getVenda() {
        return venda;
    }
}
