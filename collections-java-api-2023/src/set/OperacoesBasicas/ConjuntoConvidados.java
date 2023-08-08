package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

  private Set<Convidado> convidadosSet;

  public ConjuntoConvidados() {
    this.convidadosSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, Integer codigoConvite) {
    convidadosSet.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidadoCodigoConvite(Integer codigoConvite) {
    Convidado convidadoRemover = null;

    for (Convidado c : convidadosSet) {
      if (c.getCodigoConvite() == codigoConvite) {
        convidadoRemover = c;
        break;
      }
    }
    convidadosSet.remove(convidadoRemover);
  }

  public Integer contarConvidados() {
    return convidadosSet.size();
  }

  public void exibirConvidados() {
    System.out.println(convidadosSet);
  }
}
