package operacao_basica.lista_de_tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList; 

    public ListaTarefas(){
        this.tarefaList = new ArrayList<>(); // Sempre que eu criar, o construtor vai gerar uma lista vazia
    }

    public void adicionarTarefa(String descricao){
        Tarefa tarefa = new Tarefa(descricao); 
        this.tarefaList.add(tarefa);
    }

    public void removerTarefa(String descricao){
       List<Tarefa> tarefas_remove = new ArrayList<>(); 
        for (Tarefa t : tarefaList){
            if(descricao.equalsIgnoreCase(t.getDescricao())){
                tarefas_remove.add(t); 
            }
         }
        tarefaList.removeAll(tarefas_remove); 
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size(); 
    }

    public void  obterDescricoeString(){
        for( Tarefa t: tarefaList){
            System.out.println(t.getDescricao()); 
        }
        
    }

}
