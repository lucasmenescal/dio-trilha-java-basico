package set.OperacoesBasicas.tests;

import set.OperacoesBasicas.ConjuntoConvidados;

public class ConvidadosTests {

  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados!");

    conjuntoConvidados.adicionarConvidado("Lucas", 1234);
    conjuntoConvidados.adicionarConvidado("Jose", 1234);

    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados!");
    conjuntoConvidados.exibirConvidados();
    
    conjuntoConvidados.removerConvidadoCodigoConvite(1234);
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados!");
  }
}
