package operacoes_basicas.conjunto_de_convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados{
    // Como não podemos ter convidados repetidos na lista, iremos usar o set interface 
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>(); // HashSet não possui uma ordem exata, mas possui um desempenho bom na busca
    } 

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }
    
    public void removerConvidado(int codigoConvite){
        Convidado convidado_remover = null; 
        for (Convidado c : convidadosSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidado_remover = c; 
                break;
            }
        }
        convidadosSet.remove((convidado_remover)); 
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }
    
    public void exibirConvidados(){
        for(Convidado c : convidadosSet){
            System.out.println(c);
        }
    }

}