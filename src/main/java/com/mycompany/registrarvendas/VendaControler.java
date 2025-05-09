package com.mycompany.registrarvendas;

import java.util.ArrayList;

public class VendaControler {
    private Venda venda;
    private Repositorio repositorio = Repositorio.getInstancia();
    private ArrayList<Venda> vendas = new ArrayList<>();
    public VendaControler() {
        venda = new Venda();
    }

    public  Venda adicionarItensVenda(ItemVenda item) {

        venda.adicionarItens(item);

        return venda;
    }

    public void finalizaVenda(Caixa caixa){
        caixa.insereVendas(venda);
        vendas.add(venda);
        venda = new Venda();
    }
    public Venda getVenda() {
        return venda;
    }
    public void listarItensVendas(Venda venda) {
        for (ItemVenda item : venda.getItens()) {}
    }

    public Venda adicionaProduto(String nome, int quantidade){
        if(repositorio.buscarPorNome(nome)==null)
            System.out.println("Produto inexistente");

        ItemVenda itemVenda = new ItemVenda(quantidade,repositorio.buscarPorNome(nome));
        return adicionarItensVenda(itemVenda);

    }

    public void listaDeCompras(Caixa caixa){
        caixa.listarItensDasVendas(caixa.getVendas());
    }
}
