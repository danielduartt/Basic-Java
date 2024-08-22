package pesquisa_em_set.agenda_de_contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> listaContatos;

    public AgendaContatos() {
        this.listaContatos = new HashSet<>(); 
    } 
    
    public void adicionarContato(String nome, int numero){
        listaContatos.add(new Contato(nome, numero)); 
    }
    public void exibirContatos(){
        System.out.println(listaContatos);
    }

    public Set<Contato> pesquisarPornome(String nome){
        Set<Contato> contatos_encontrados = new HashSet<>(); 
        if(listaContatos.isEmpty()){
            System.out.println("A lista está vazia!");
        }else{
            for(Contato c : listaContatos){
                if(c.getNome().startsWith(nome)){
                    contatos_encontrados.add(c); 
            } }
        }
        return contatos_encontrados; 
     }          

     public Contato atualizarNumeroContato(String nome, int novoNum){
        Contato contatoAtualizado = null ; 
        for(Contato c : listaContatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNum);
                contatoAtualizado = c; 
                break;
            }
        }
        return contatoAtualizado; 
     }
}
