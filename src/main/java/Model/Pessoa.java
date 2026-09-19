package Model;
import java.util.List;

public class Pessoa {

    private int id;
    private String nome;
    private int idade;
    private String cidade;
    private List<Pedido> pedidos;

    public Pessoa(int id, String nome, int idade, String cidade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return String.format(
                "%d - %s | %d anos | %s",
                id, nome, idade, cidade
        );
    }
}
