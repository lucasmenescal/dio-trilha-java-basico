package list.OperacoesBasicas.tests;

import list.OperacoesBasicas.CarrinhoCompras;

public class ListaItensTest {
	public static void main(String[] args) {
		CarrinhoCompras carrinho = new CarrinhoCompras();

		carrinho.adicionarItem("Cebola", 3.50, 10);
		carrinho.adicionarItem("Batata", 4.00, 5);

		carrinho.exibirItens();
		System.out.println(carrinho.calcularValorTotal());
		carrinho.removeItem("Cebola");

		carrinho.exibirItens();
		System.out.println(carrinho.calcularValorTotal());
	}
}
