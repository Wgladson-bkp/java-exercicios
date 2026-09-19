package Model;
import Model.Pessoa;
import Model.Produto;

import java.util.List;

public class Pedido {

    private int id;
    private Pessoa pessoa;
    private List<Produto> produtos;
    private String status;

    public Pedido(
            int id,
            Pessoa pessoa,
            List<Produto> produtos,
            String status
    ) {
        this.id = id;
        this.pessoa = pessoa;
        this.produtos = produtos;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public String getStatus() {
        return status;
    }

    public double getValorTotal() {
        return produtos.stream()
                .mapToDouble(Produto::getPreco)
                .sum();
    }

    @Override
    public String toString() {
        return String.format(
                "Pedido %d | %s | %s | R$ %.2f",
                id,
                pessoa.getNome(),
                status,
                getValorTotal()
        );
    }
}