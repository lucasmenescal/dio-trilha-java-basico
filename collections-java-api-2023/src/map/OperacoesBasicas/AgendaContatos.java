package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  private Map<String, Integer> agendaContatosMap;

  public AgendaContatos() {
    this.agendaContatosMap = new HashMap<>();
  }

  public void adicionarContatos(String nome, Integer telefone) {
    agendaContatosMap.put(nome, telefone);
  }

  public void removeContato(String nome) {
    if (!agendaContatosMap.isEmpty()) {
      agendaContatosMap.remove(nome);
    }
  }

  public Integer pesquisaNome(String nome) {
    Integer numeroTelefone = null;
    if (!agendaContatosMap.isEmpty()) {
      numeroTelefone = agendaContatosMap.get(nome);
    }
    return numeroTelefone;
  }

  public void exibirContatos() {
    System.out.println(agendaContatosMap);
  }
}
