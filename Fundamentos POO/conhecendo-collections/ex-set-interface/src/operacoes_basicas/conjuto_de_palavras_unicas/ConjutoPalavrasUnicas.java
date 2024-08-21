package operacoes_basicas.conjuto_de_palavras_unicas;
import java.util.HashSet;
import java.util.Set;

public class ConjutoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjutoPalavrasUnicas() {
        palavrasUnicas = new HashSet<String>(); 
    } 
    
    public void adicionarPalavras(String palavra){
        palavrasUnicas.add(palavra); 
    }

    public void removerPalabras(String palavra){
        for (String p : palavrasUnicas){
            if(p == palavra){
                palavrasUnicas.remove(p); 
                break; 
            }
        }
    }
    public void verificarPalavra(String palavra){
        for (String p : palavrasUnicas){
            if(p == palavra){
                System.out.println("A palavra " + palavra + " está presente na lista");
            }
        }
    }
    public void exibirPalarasUnicas(){
        System.out.println(palavrasUnicas); 
    }

    @Override
    public String toString() {
        return "ConjutoPalavrasUnicas [palavrasUnicas=" + palavrasUnicas + "]";
    }
}
