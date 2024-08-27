import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.Stream;

public class SupllierExample {
    /*
    Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T
    É comumente usada para criar ou fornecer novos objetos de um determinado tipo
   */

    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";
        // Usar o Supplier para obter uma lista com 5 saudações

        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        List<String> listaSaudacoes2 = Stream.generate(() -> "Olá, seja bem vindo 2")
                .limit(5)
                        .toList();

        // Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);
        listaSaudacoes2.forEach(System.out::println);
    }
}
