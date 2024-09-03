import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    //Verifique se todos os números da lista são positivos:
    //Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean numerosPositivos = numeros.stream().allMatch(num -> num > 0);
        String resultado = numerosPositivos ? "Todos são positivos" : "Nem todos são positivos";
        System.out.println(resultado);
    }
}
