package operacoes_basicas.agenda_de_contatos;

import java.util.Map; 
import java.util.HashMap;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap; 

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>(); 
    }

    public void addContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone); 
    }

    public void removerContato(String nome){
        if(agendaContatoMap.isEmpty()){
            System.out.println("Agenda Vazia!");
        }else{
            agendaContatoMap.remove(nome); 
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        if(!agendaContatoMap.isEmpty()){
            return agendaContatoMap.get(nome); 
        }else{
            return null; 
        }
    }
}
