import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
/*
Consumer recebe um valor mas não retorna nada.
É utilizado principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream,
sem modificar, ou retornar um valor
 */

public class ConsumerExample {
    public static void main(String[] args) {
        //Criar a lista de inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,50);

        //Usar o consumer com ex´ressãp lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };

        // usar o consumer para imprimir números pares no Stream
        numeros.stream().forEach(imprimirNumeroPar);

        // Outra Forma
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if(integer % 2 == 0){
                    System.out.println(integer);
                }
            }
        });

        // Transformando em Lambda
        numeros.forEach( n -> {
           if(n%2 == 0){
               System.out.println(n);
           }
        });
    }
}
