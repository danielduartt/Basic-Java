package operacao_basica.lista_de_tarefas;

public interface App {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 2");
        lista.adicionarTarefa("Tarefa 3");
        lista.adicionarTarefa("Tarefa 3");
        lista.adicionarTarefa("Tarefa 4");
        lista.obterDescricoeString();
        System.out.println("SIZE:" + lista.obterNumeroTotalTarefas()); 
        System.out.println("-----------------------------------------------------------------------------------"); 
        lista.removerTarefa("Tarefa 3");    
        lista.obterDescricoeString();
    }
}
