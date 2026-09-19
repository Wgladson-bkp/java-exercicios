package com.teste.projeto1.demo;

import Model.Dados;
import Model.Pedido;
import Model.Pessoa;
import Model.Produto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import java.util.Comparator;
import java.util.List;

public class StreamsExercicio implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(StreamsExercicio.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Pessoa> pessoas = Dados.criarPessoas();

        List<Produto> produtos = Dados.criarProdutos();

        List<Pedido> pedidos =
                Dados.criarPedidos(pessoas, produtos);

        //System.out.println("\nPEDIDOS");
        //pedidos.forEach(System.out::println);

        System.out.println("Exibindo preços de produtos ordenados decrescente:");
        var pedidosOrdenados = produtos.stream()
                .sorted(Comparator.comparingDouble(Produto::getPreco)
                        .reversed());
        pedidosOrdenados.forEach(System.out::println);

        System.out.println("Filtrando pessoas com o nome iniciando com a letra A");
        var nomeLetraA = pessoas.stream()
                .filter(x -> x.getNome()
                                .regionMatches(true,0,"A",0,1))
                .toList();

        nomeLetraA.forEach(System.out::println);

        System.out.println("Filtrando produtos com o nome iniciando com a letra B");
        var nomeLetraB = produtos.stream().
                filter(x -> x.getNome()
                        .regionMatches(true,0,"B",0,1))
                .toList();
        nomeLetraB.forEach(System.out::println);

        System.out.println("Obtendo preços dos produtos com Map()");
        var valores = produtos.stream()
                .map(x -> x.getPreco())
                .toList();
        valores.forEach(System.out::println);

        System.out.println("Filtrando preços acima de 1000 dos produtos com Map() e filter()");
        var valoresFiltrados = produtos.stream()
                .filter(x -> x.getPreco()>1000)
                .map(x -> x.getPreco())
                .toList();
        valoresFiltrados.forEach(System.out::println);

    }
}
