/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrarvendas;


/**
 *
 * @author IFNMG
 */
public class RegistrarVendas {

    public static void main(String[] args) {

          Caixa caixa = new Caixa (1l,"Adalberto");
          Repositorio repositorio = Repositorio.getInstancia();

          repositorio.adicicionarProduto(new Produto("arroz",20.9));


          repositorio.adicicionarProduto(new Produto("feijao",5.49));
          repositorio.adicicionarProduto(new Produto("macarrao",7.48));
          repositorio.adicicionarProduto(new Produto("bolacha",2.75));
          repositorio.adicicionarProduto(new Produto("manteiga",5.70));

          VendaControler controller = new VendaControler();

          controller.adicionaProduto("arroz",2);
          controller.adicionaProduto("feijao",3);
          controller.adicionaProduto("macarrao",1);
          controller.finalizaVenda(caixa);

          controller.adicionaProduto("bolacha",2);
          controller.adicionaProduto("manteiga",1);
          controller.finalizaVenda(caixa);

          controller.listaDeCompras(caixa);

    }
    
}
