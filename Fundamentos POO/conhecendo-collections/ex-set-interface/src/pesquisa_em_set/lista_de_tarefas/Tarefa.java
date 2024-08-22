package pesquisa_em_set.lista_de_tarefas;

public class Tarefa {
    private String descricao; 
    private boolean concluida; 

    public Tarefa(String descricao){
        this.descricao = descricao; 
        this.concluida = false; 
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        String status = concluida ? "Concluída" : "Não Concluída";
        return "[" + "Descrição: " + descricao + "; " + "Status: " + status + "]";
    }
}
