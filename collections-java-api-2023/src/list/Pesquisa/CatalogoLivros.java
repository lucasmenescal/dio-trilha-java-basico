package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  private List<Livro> livroList;

  public CatalogoLivros() {
    this.livroList = new ArrayList<>();
  }

  public void adicionarLivro(String livro, String autor, int anoPublicacao) {
    livroList.add(new Livro(livro, autor, anoPublicacao));
  }

  public List<Livro> pesquisaAutor(String autor) {
    List<Livro> livrosAutor = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAutor().equalsIgnoreCase(autor)) {
          livrosAutor.add(l);
        }
      }
    }
    return livrosAutor;
  }

  public List<Livro> pesquisaIntervaloAno(int anoInicial, int anoFinal) {
    List<Livro> livrosIntervaloAno = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
          livrosIntervaloAno.add(l);
        }
      }
    }
    return livrosIntervaloAno;
  }

  public Livro pesquisaLivro(String titulo) {
    Livro livroTitulo = null;

    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getTitulo().equalsIgnoreCase(titulo)) {
          livroTitulo = l;
          break;
        }
      }
    }
    return livroTitulo;
  }
}