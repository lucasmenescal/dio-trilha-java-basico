package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
  public Set<Produto> produtoSet;

  public CadastroProdutos() {
    this.produtoSet = new HashSet<>();
  }

  public void adicionarProduto(String nome, Long codigo, Integer quantidade, Double preco) {
    produtoSet.add(new Produto(nome, codigo, preco, quantidade));
  }

  public Set<Produto> exibirProdutoNome(){
    Set<Produto> produtosNome = new TreeSet<>(produtoSet);
    return produtosNome;
  }

  public Set<Produto> exibiProdutoPreco(){
    Set<Produto> produtoPreco = new TreeSet<>(new Produto());
    produtoPreco.addAll(produtoSet);
    return produtoPreco;
  }


}
