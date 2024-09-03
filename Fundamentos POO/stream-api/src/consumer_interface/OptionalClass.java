import java.util.Optional;
/*
O objetivo da classe Optional no Java é fornecer uma abordagem mais segura e expressiva para tratar casos em que um valor pode ser
ausente (nulo). Ela foi introduzida a partir do Java 8 para evitar o temido NullPointerException (NPE) que é comum quando se trabalha
com referências nulas. Optional permite encapsular um valor que pode ser nulo dentro de um objeto Optional. Isso indica explicitamente
que o valor pode ou não estar presente e requer que o código que deseja acessá-lo faça uma verificação explícita.
 */

public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Hello");
        System.out.println(optionalValue.get());
    }
}
