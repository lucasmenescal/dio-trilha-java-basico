package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> listaItens;

    public CarrinhoCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, Integer quantidade) {
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removeItem(String nome) {
        List<Item> itensRemover = new ArrayList<>();
        for (Item i : listaItens) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensRemover.add(i);
            }
        }
        listaItens.removeAll(itensRemover);
    }

    public Double calcularValorTotal() {
        Double total = (double) 0;
        for (Item i : listaItens) {
            total += i.getPreco() * i.getQuantidade();
        }
        return total;
    }

    public void exibirItens() {
        System.out.println(listaItens);
    }

}
