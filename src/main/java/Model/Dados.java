package Model;
import Model.Pedido;
import Model.Pessoa;
import Model.Produto;

import java.util.ArrayList;
import java.util.List;

public class Dados {

    public static List<Pessoa> criarPessoas() {

        return new ArrayList<>(List.of(

                new Pessoa(1, "João", 22, "Fortaleza"),
                new Pessoa(2, "Maria", 31, "São Paulo"),
                new Pessoa(3, "Pedro", 17, "Fortaleza"),
                new Pessoa(4, "Ana", 28, "Recife"),
                new Pessoa(5, "Carlos", 42, "São Paulo"),
                new Pessoa(6, "Juliana", 19, "Recife"),
                new Pessoa(7, "Marcos", 35, "Fortaleza"),
                new Pessoa(8, "Fernanda", 26, "Salvador"),
                new Pessoa(9, "Ricardo", 16, "Salvador"),
                new Pessoa(10, "Camila", 39, "Recife"),
                new Pessoa(11, "Bruno", 24, "Fortaleza"),
                new Pessoa(12, "Patrícia", 45, "São Paulo"),
                new Pessoa(13, "Lucas", 29, "Salvador"),
                new Pessoa(14, "Beatriz", 21, "Recife"),
                new Pessoa(15, "Rafael", 33, "Fortaleza")

        ));
    }

    public static List<Produto> criarProdutos() {

        return new ArrayList<>(List.of(

                new Produto(
                        1,
                        "Notebook",
                        "Eletrônicos",
                        4500.00,
                        12
                ),

                new Produto(
                        2,
                        "Mouse",
                        "Eletrônicos",
                        120.00,
                        50
                ),

                new Produto(
                        3,
                        "Teclado",
                        "Eletrônicos",
                        250.00,
                        30
                ),

                new Produto(
                        4,
                        "Monitor",
                        "Eletrônicos",
                        1800.00,
                        8
                ),

                new Produto(
                        5,
                        "Celular",
                        "Eletrônicos",
                        3200.00,
                        15
                ),

                new Produto(
                        6,
                        "Cadeira",
                        "Móveis",
                        850.00,
                        20
                ),

                new Produto(
                        7,
                        "Mesa",
                        "Móveis",
                        1200.00,
                        10
                ),

                new Produto(
                        8,
                        "Estante",
                        "Móveis",
                        950.00,
                        7
                ),

                new Produto(
                        9,
                        "Cama",
                        "Móveis",
                        2100.00,
                        5
                ),

                new Produto(
                        10,
                        "Sofá",
                        "Móveis",
                        3500.00,
                        4
                ),

                new Produto(
                        11,
                        "Camiseta",
                        "Roupas",
                        80.00,
                        100
                ),

                new Produto(
                        12,
                        "Calça",
                        "Roupas",
                        180.00,
                        60
                ),

                new Produto(
                        13,
                        "Tênis",
                        "Roupas",
                        450.00,
                        35
                ),

                new Produto(
                        14,
                        "Jaqueta",
                        "Roupas",
                        380.00,
                        25
                ),

                new Produto(
                        15,
                        "Boné",
                        "Roupas",
                        70.00,
                        80
                ),

                new Produto(
                        16,
                        "Livro Java",
                        "Livros",
                        90.00,
                        40
                ),

                new Produto(
                        17,
                        "Livro SQL",
                        "Livros",
                        110.00,
                        25
                ),

                new Produto(
                        18,
                        "Livro Python",
                        "Livros",
                        100.00,
                        30
                ),

                new Produto(
                        19,
                        "Livro C#",
                        "Livros",
                        95.00,
                        20
                ),

                new Produto(
                        20,
                        "Livro JavaScript",
                        "Livros",
                        130.00,
                        15
                )
        ));
    }

    public static List<Pedido> criarPedidos(
            List<Pessoa> pessoas,
            List<Produto> produtos
    ) {

        List<Pedido> pedidos = new ArrayList<>();

        pedidos.add(new Pedido(
                1,
                pessoas.get(0),
                List.of(
                        produtos.get(0),
                        produtos.get(1)
                ),
                "ENTREGUE"
        ));

        pedidos.add(new Pedido(
                2,
                pessoas.get(1),
                List.of(
                        produtos.get(4)
                ),
                "ENTREGUE"
        ));

        pedidos.add(new Pedido(
                3,
                pessoas.get(2),
                List.of(
                        produtos.get(10),
                        produtos.get(11)
                ),
                "CANCELADO"
        ));

        pedidos.add(new Pedido(
                4,
                pessoas.get(3),
                List.of(
                        produtos.get(5),
                        produtos.get(6)
                ),
                "ENVIADO"
        ));

        pedidos.add(new Pedido(
                5,
                pessoas.get(4),
                List.of(
                        produtos.get(3),
                        produtos.get(2),
                        produtos.get(1)
                ),
                "ENTREGUE"
        ));

        pedidos.add(new Pedido(
                6,
                pessoas.get(5),
                List.of(
                        produtos.get(12)
                ),
                "PENDENTE"
        ));

        pedidos.add(new Pedido(
                7,
                pessoas.get(6),
                List.of(
                        produtos.get(8),
                        produtos.get(9)
                ),
                "ENTREGUE"
        ));

        pedidos.add(new Pedido(
                8,
                pessoas.get(7),
                List.of(
                        produtos.get(15),
                        produtos.get(16)
                ),
                "ENVIADO"
        ));

        pedidos.add(new Pedido(
                9,
                pessoas.get(8),
                List.of(
                        produtos.get(10),
                        produtos.get(14)
                ),
                "CANCELADO"
        ));

        pedidos.add(new Pedido(
                10,
                pessoas.get(9),
                List.of(
                        produtos.get(7),
                        produtos.get(5),
                        produtos.get(12)
                ),
                "ENTREGUE"
        ));

        pedidos.add(new Pedido(
                11,
                pessoas.get(10),
                List.of(
                        produtos.get(17),
                        produtos.get(18)
                ),
                "PENDENTE"
        ));

        pedidos.add(new Pedido(
                12,
                pessoas.get(11),
                List.of(
                        produtos.get(0),
                        produtos.get(4)
                ),
                "ENTREGUE"
        ));

        pedidos.add(new Pedido(
                13,
                pessoas.get(12),
                List.of(
                        produtos.get(19),
                        produtos.get(16)
                ),
                "ENVIADO"
        ));

        pedidos.add(new Pedido(
                14,
                pessoas.get(13),
                List.of(
                        produtos.get(11),
                        produtos.get(13)
                ),
                "ENTREGUE"
        ));

        pedidos.add(new Pedido(
                15,
                pessoas.get(14),
                List.of(
                        produtos.get(6),
                        produtos.get(8),
                        produtos.get(9)
                ),
                "ENTREGUE"
        ));

        return pedidos;
    }
}