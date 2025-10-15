package LISTA.MAPP;

import java.util.HashMap;
import java.util.Map;

public class ListaMercado {

    // A chave é o NOME e o valor ItemMercado.
    private final Map<String, ItemMercado> lista;

    public ListaMercado() {

        this.lista = new HashMap<>();
    }

    public void adicionarItem(ItemMercado item) {
        if (item != null) {
            lista.put(item.getNome(), item);
            System.out.println("-> Adicionado: " + item.getNome());
        }
    }

    public void exibirLista() {
        if (lista.isEmpty()) {
            System.out.println("A lista de mercado está vazia.");
            return;
        }

        System.out.println("\n*** LISTA DE COMPRAS ***");


        lista.forEach((nomeItem, itemObjeto) -> {
            //se eu utilizar nomeItem sai apenas o nome
            System.out.println("-> " + itemObjeto.toString());
        });
        System.out.println("-------------------------------------");
    }

    public boolean itemExiste(String nome) {
        return lista.containsKey(nome);
    }
}
