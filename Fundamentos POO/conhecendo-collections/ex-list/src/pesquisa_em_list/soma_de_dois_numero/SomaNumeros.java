package pesquisa_em_list.soma_de_dois_numero;
import java.util.List; 
import java.util.ArrayList; 

public class SomaNumeros {
    private List<Integer> numerosList; 

    public SomaNumeros(){
        this.numerosList = new ArrayList<>(); 
    }

    public void adicionarNumero(int num){
        Integer numInteger = num; 
        numerosList.add(numInteger); 
    }

    public int calcularSoma(){
        int soma = 0; 
        for(Integer i : numerosList){
            soma += i; 
        }
        return soma; 
    }

    public int encontrarMaiorNumero(){
        int menor_num = 0, maior_num = 0; 

        if(numerosList.isEmpty()){
            throw new RuntimeException("A lista está vazia!"); 
        }else{
            for(Integer i : numerosList){
                if(i >= menor_num){
                    maior_num = i; 
                }
            }
        }
        return maior_num; 
    }
    
    public int encontrarMenorNumero() {
        int num_menor = numerosList.get(0);
        if (numerosList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        }else{
            for (Integer i : numerosList) {
                if (i <= num_menor) {
                    num_menor = i;
                }
            }
        }
        return num_menor;
    }

    public void exibirNumeros(){
        for(Integer i : numerosList){
            System.out.println(i);
        }
    }
}
