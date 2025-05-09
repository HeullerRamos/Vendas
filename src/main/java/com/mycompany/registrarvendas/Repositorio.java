package com.mycompany.registrarvendas;

import java.util.ArrayList;

public class Repositorio {

    private ArrayList<Produto> produtos;

    private ArrayList<Venda> vendas;

    private ArrayList<Caixa> caixas;

    private static Repositorio instancia;

    public  static Repositorio getInstancia() {
        if (instancia == null) {
            instancia = new Repositorio();
        }
        return instancia;
    }

    public void adicicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public Produto buscarPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
}
