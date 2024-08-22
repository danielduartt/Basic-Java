package pesquisa_em_set.lista_de_tarefas;

public class App {
    public static void main(String[] args) {
        ListaTarefas tarefa = new ListaTarefas(); 
        tarefa.adicionarTarefa("Estudar eletrônica");
        tarefa.adicionarTarefa("Estudar Java");
        tarefa.adicionarTarefa("Estudar Python");
        tarefa.exibirTarefas();
        System.out.println("----------------------------------------------------------------------------");
        tarefa.marcarTarefaConcluida("Estudar eletrônica");
        tarefa.marcarTarefaConcluida("Estudar eletrônica ");
        tarefa.marcarTarefaConcluida("Estudar Java");
        tarefa.exibirTarefas();
        System.out.println("----------------------------------------------------------------------------");
        tarefa.marcarTarefaPendente("Estudar Java");
        tarefa.exibirTarefas();
    }
}
