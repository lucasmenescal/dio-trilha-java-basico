package list.Pesquisa.tests;

import list.Pesquisa.CatalogoLivros;

public class LivrosTest {
  public static void main(String[] args) {
    CatalogoLivros catalogoLivros = new CatalogoLivros();
    catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2000);
    catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
    catalogoLivros.adicionarLivro("Livro 2", "Autor 3", 2023);
    catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2000);
    catalogoLivros.adicionarLivro("Livro 4", "Autor 2", 2019);
    catalogoLivros.adicionarLivro("Livro 4", "Autor 3", 2018);
    catalogoLivros.adicionarLivro("Livro 5", "Autor 4", 2020);

    System.out.println(catalogoLivros.pesquisaAutor("Autor 2"));
    System.out.println(catalogoLivros.pesquisaAutor("Autor 3"));
    System.out.println(catalogoLivros.pesquisaIntervaloAno(2013, 2019));
    System.out.println(catalogoLivros.pesquisaLivro("Livro 1"));

  }
}
