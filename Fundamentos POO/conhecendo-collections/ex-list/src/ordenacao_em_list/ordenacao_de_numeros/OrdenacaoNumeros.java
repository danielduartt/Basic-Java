package ordenacao_em_list.ordenacao_de_numeros;

import java.util.List; 
import java.util.ArrayList; 
import java.util.Collections; 

public class OrdenacaoNumeros  {
    private List<Integer> numerosList; 

    public OrdenacaoNumeros(){
        this.numerosList = new ArrayList<>(); 
    }

    public void adicionarNumero(int num){
        numerosList.add(num); 
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
          numerosAscendente.sort(Collections.reverseOrder());
          return numerosAscendente;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
      }

      public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
          System.out.println(this.numerosList);
        } else {
          System.out.println("A lista está vazia!");
        }
      }
}
