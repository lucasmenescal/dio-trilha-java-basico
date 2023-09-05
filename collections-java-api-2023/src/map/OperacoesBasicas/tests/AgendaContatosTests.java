package map.OperacoesBasicas.tests;

import map.OperacoesBasicas.AgendaContatos;

public class AgendaContatosTests {
  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();
    agendaContatos.adicionarContatos("Lucas", 123456);
    agendaContatos.adicionarContatos("Camila", 123);
    agendaContatos.adicionarContatos("Vi", 123456789);
    agendaContatos.adicionarContatos("Lucas", 1234567890);

    agendaContatos.exibirContatos();
    
    agendaContatos.removeContato("Camila");
    agendaContatos.exibirContatos();

  }
}
