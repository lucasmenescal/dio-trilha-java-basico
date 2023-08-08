package list.Ordenacao.tests;

import list.Ordenacao.OrdenacaoPessoa;

public class OrdenacaoPessoaTests {
  public static void main(String[] args) {
    OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

    ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
    ordenacaoPessoa.adicionarPessoa("Nome 2",30, 1.80);
    ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.76);
    ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

    System.out.println(ordenacaoPessoa.ordenarIdade());
    System.out.println(ordenacaoPessoa.ordenarAltura());
  }
}
