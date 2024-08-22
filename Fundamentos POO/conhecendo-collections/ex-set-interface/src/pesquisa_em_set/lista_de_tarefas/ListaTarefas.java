package pesquisa_em_set.lista_de_tarefas;

import java.util.Set; 
import java.util.HashSet; 

public class ListaTarefas {
    private Set<Tarefa> listaTarefas; 

    public ListaTarefas(){
        this.listaTarefas = new HashSet<Tarefa>();  
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao)); 
    }

    public void removerTarefa(String descricao){
        if(!listaTarefas.isEmpty()){
            for(Tarefa t : listaTarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    listaTarefas.remove(t); 
                    break;
                }
            }
        }else{
            System.out.println("A lista de tarefas está vazia!");
        }
    }

    public void exibirTarefas(){
        System.out.println(listaTarefas);
    }

    public int contarTarefa(){
        return listaTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> listaConcluido = new HashSet<>(); 
        if(!listaTarefas.isEmpty()){
            for(Tarefa t : listaTarefas){
                if(t.isConcluida()){
                    listaConcluido.add(t); 
                }
            }
        }else{
            System.err.println("Lista de tarefas está vazia!");
            return listaConcluido = new HashSet<>(); 
        }
        return listaConcluido; 
    }

    public Set<Tarefa> obterPendentes(){
        Set<Tarefa> listaPendentes = new HashSet<>(); 
        if(!listaTarefas.isEmpty()){    
            for(Tarefa t : listaTarefas){
                if(!t.isConcluida()){
                    listaPendentes.add(t);;
                }
            }
        }else{
            System.err.println("Lista de tarefas está vazia!");
        }
        return listaPendentes; 
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                if (!t.isConcluida()) {
                    t.setConcluida(true);
                } else {
                    System.out.println("A tarefa '" + descricao + "' já está concluída.");
                }
                return;
            }
        }
        System.out.println("Tarefa com a descrição '" + descricao + "' não encontrada.");
    }


    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                if (t.isConcluida()) {
                    t.setConcluida(false);
                } else {
                    System.out.println("A tarefa '" + descricao + "' já está pendente.");
                }
                return;
            }
        }
        System.out.println("Tarefa com a descrição '" + descricao + "' não encontrada.");
    }
    
    public void limparListaTarefas(){
        if(listaTarefas.isEmpty()){
            System.err.println("A lista já está vazia  ");
        }else{
            listaTarefas.clear();
        }
    }

}
