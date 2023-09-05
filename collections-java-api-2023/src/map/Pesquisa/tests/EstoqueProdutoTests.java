package map.Pesquisa.tests;

import map.Pesquisa.EstoqueProduto;

public class EstoqueProdutoTests {
  public static void main(String[] args) {
    EstoqueProduto estoque = new EstoqueProduto();

    estoque.adicionarProduto(1L, "Produto A", 10, 5.0);
    estoque.adicionarProduto(2L, "Produto B", 5, 10.0);
    estoque.adicionarProduto(3L, "Produto C", 2, 15.0);

    estoque.exibirProdutos();
    System.out.println("Valor total do estoque: R$ " + estoque.calculaValorTotalEstoque());
    System.out.println("Produto mais caro" + estoque.obteProdutoMaisCaro());
  }
}
