package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
  private Map<Long, Produto> estoqueProdutoMap;

  public EstoqueProduto() {
    this.estoqueProdutoMap = new HashMap<>();
  }

  public void adicionarProduto(Long cod, String nome, Integer quantidade, Double preco) {
    estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
  }

  public void exibirProdutos() {
    System.out.println(estoqueProdutoMap);
  }

  public Double calculaValorTotalEstoque() {
    Double valorTotalEstoque = 0d;
    if (!estoqueProdutoMap.isEmpty()) {
      for (Produto p : estoqueProdutoMap.values()) {
        valorTotalEstoque += p.getPreco() * p.getQuantidade();
      }
    }
    return valorTotalEstoque;
  }

  public Produto obteProdutoMaisCaro() {
    Produto produtoCaro = null;
    Double maiorPreco = Double.MIN_VALUE;

    if (!estoqueProdutoMap.isEmpty()) {
      for (Produto p : estoqueProdutoMap.values()) {
        if (p.getPreco() > maiorPreco) {
          produtoCaro = p;
        }
      }
    }
    return produtoCaro;
  }
}
