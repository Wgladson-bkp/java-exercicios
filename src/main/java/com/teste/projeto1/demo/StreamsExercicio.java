package com.teste.projeto1.demo;

import Model.Dados;
import Model.Pedido;
import Model.Pessoa;
import Model.Produto;

import java.util.List;

public class StreamsExercicio {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Dados.criarPessoas();

        List<Produto> produtos = Dados.criarProdutos();

        List<Pedido> pedidos =
                Dados.criarPedidos(pessoas, produtos);

        System.out.println("\nPEDIDOS");
        pedidos.forEach(System.out::println);

    }
}
