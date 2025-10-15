package LISTA.MAPP;

public class ItemMercado {
    // Chave do Map será o nome e o valor será a quantidade.
    private final String nome;
    private int quantidade;

    public ItemMercado(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            System.err.println("ERRO: Quantidade deve ser positiva.");
        }
    }

    @Override
    public String toString() {
        return "Item: " + nome + " | Qtde: " + quantidade;
    }
}