package com.mycompany.registrarvendas;

public class VendaControler {
    private Venda venda;
    private Repositorio repositorio = Repositorio.getInstancia();

    public VendaControler() {
        venda = new Venda();
    }

    public  Venda adicionarItensVenda(ItemVenda item) {

        venda.adicionarItens(item);

        return venda;
    }

    public void finalizaVenda(Caixa caixa){
        caixa.insereVendas(venda);
        venda = new Venda();
    }
    public Venda getVenda() {
        return venda;
    }

    public Venda adicionaProduto(String nome, int quantidade){
        if(repositorio.buscarPorNome(nome)==null)
            System.out.println("Produto inexistente");

        ItemVenda itemVenda = new ItemVenda(quantidade,repositorio.buscarPorNome(nome));
        return adicionarItensVenda(itemVenda);

    }
}
