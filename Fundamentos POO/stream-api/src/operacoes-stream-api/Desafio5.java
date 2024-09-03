import java.util.List;
import java.util.Arrays;
public class Desafio5 {
    public static void main(String[] args) {
        //Calcule a média dos números maiores que 5:
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numeroMaiores = numeros.stream().filter(n->n > 5).toList();
        int somaNumeros = numeroMaiores.stream().reduce(0, Integer::sum); //(n1, n2) -> n1+n2
        System.out.println("Média: " + somaNumeros/numeroMaiores.size());

    }
}
