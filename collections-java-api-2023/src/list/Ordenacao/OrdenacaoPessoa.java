package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
  private List<Pessoa> pessoaList;

  public OrdenacaoPessoa() {
    this.pessoaList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, Integer idade, Double altura) {
    pessoaList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarIdade() {
    List<Pessoa> pessoaIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoaIdade);
    return pessoaIdade;
  }

  public List<Pessoa> ordenarAltura() {
    List<Pessoa> pessoaAltura = new ArrayList<>(pessoaList);
    Collections.sort(pessoaAltura, new Pessoa());
    return pessoaAltura;
  }
}
