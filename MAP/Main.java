package LISTA.MAPP;

public class Main {
    public static void main(String[] args) {

        ListaMercado gerenciador = new ListaMercado();

        System.out.println(">>> Criando e Adicionando Itens <<<");

        ItemMercado item1 = new ItemMercado("Arroz", 1);
        gerenciador.adicionarItem(item1);

        ItemMercado item2 = new ItemMercado("Feijão", 2);
        gerenciador.adicionarItem(item2);

        ItemMercado item3 = new ItemMercado("Açúcar", 1);
        gerenciador.adicionarItem(item3);

        gerenciador.exibirLista();

        String itemChecar = "Feijão";
        System.out.println("\n--- COSULTA ---");
        if (gerenciador.itemExiste(itemChecar)) {
            System.out.println("-> O item '" + itemChecar + "' está na lista.");
        } else {
            System.out.println("-> O item '" + itemChecar + "' NÃO está na lista.");
        }
    }
}
