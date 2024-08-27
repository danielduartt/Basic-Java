/*
Binary Operator Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
É usada para realizar operações de redução em pares de ementos, como somar números ou combinar objetos.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;


        int resultado = numeros.stream().reduce(0, Integer::sum ); //o primeiro valor ler como uma variável temporária

        System.out.println(resultado);
    }

}
