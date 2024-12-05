package com.coolapp.dao;


import com.coolapp.model.Order;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductRepository {
    private final ArrayList<Order> produtosCadastrados;
    private final HashMap<String, Double> tabelaDePrecos;

    public ProductRepository() {
        tabelaDePrecos = new HashMap<>();
        produtosCadastrados = new ArrayList<>();
    }
    public void adicionarProduto(Order produto) {
        produtosCadastrados.add(produto);
        tabelaDePrecos.put(produto.getName(), produto.getPrice());
    }

    public void listarTabelDePrecos() {
        for (var entry : tabelaDePrecos.entrySet()) {
            System.out.println(entry.getKey() + ": R$" + entry.getValue());
        }
    }
     public void listarProdutosEmProcessamento(){
        for (Order produto : produtosCadastrados){
            System.out.println("Produto: " + produto.getName() + " - " + produto.getOrderStatus());
        }
     }

}
