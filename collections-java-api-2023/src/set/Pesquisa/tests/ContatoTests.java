package set.Pesquisa.tests;

import set.Pesquisa.AgendaContatos;

public class ContatoTests {
  public static void main(String[] args) {

    AgendaContatos agenda = new AgendaContatos();

    agenda.exibirContatos();
    
    agenda.adicionarContato("Lucas", 123456789);
    agenda.adicionarContato("Lucas", 0);
    agenda.adicionarContato("Maria", 456123456);
    agenda.adicionarContato("Camila", 123456456);
    agenda.exibirContatos();
    agenda.atualizarContato("Lucas", 0);
    agenda.exibirContatos();
  }
}
