package set.Ordenacao.tests;

import set.Ordenacao.CadastroProdutos;

public class ProdutosTests {
  public static void main(String[] args) {

    CadastroProdutos cadastroProdutos = new CadastroProdutos();

    cadastroProdutos.adicionarProduto("Produto 9", 1L, 10, 15d);
    cadastroProdutos.adicionarProduto("Produto 2", 2L, 15, 20d);
    cadastroProdutos.adicionarProduto("Produto 3", 1L, 5, 10d);
    cadastroProdutos.adicionarProduto("Produto 4", 3L, 25, 5d);

    System.out.println(cadastroProdutos.produtoSet);
    System.out.println(cadastroProdutos.exibirProdutoNome());
    System.out.println(cadastroProdutos.exibiProdutoPreco());
  }
}
