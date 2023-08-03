package list.OperacoesBasicas.tests;
import list.OperacoesBasicas.ListaTarefa;

public class ListaTarefaTest {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 3");

        System.out.println(listaTarefa.obterNumeroTotalTarefas()); // Esperado 4
        listaTarefa.removeTarefa("Tarefa 3");
        System.out.println(listaTarefa.obterNumeroTotalTarefas()); // Esperado 2

        listaTarefa.obterDescricoesTarefas();

    }
}