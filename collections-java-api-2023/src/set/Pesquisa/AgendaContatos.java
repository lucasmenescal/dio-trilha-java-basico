package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  private Set<Contato> contatoSet;

  public AgendaContatos() {
    this.contatoSet = new HashSet<>();
  }

  public void adicionarContato(String nome, Integer numero) {
    contatoSet.add(new Contato(nome, numero));
  }

  public void exibirContatos() {
    System.out.println(contatoSet);
  }

  public Set<Contato> pesquisaNome(String nome) {
    Set<Contato> contatosNome = new HashSet<>();

    for (Contato c : contatoSet) {
      if (c.getNome().startsWith(nome)) {
        contatosNome.add(c);
      }
    }
    return contatosNome;
  }

  public Contato atualizarContato(String nome, Integer numero) {
    Contato contatoAtualizado = null;

    for (Contato c : contatoSet) {
      if (c.getNome().equalsIgnoreCase(nome)) {
        c.setNumero(numero);
        contatoAtualizado = c;
        break;
      }
    }
    return contatoAtualizado;
  }
}
