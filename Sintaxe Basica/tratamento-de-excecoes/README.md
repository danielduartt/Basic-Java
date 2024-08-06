# Tratamento de Exceções em Java
O tratamento de exceções é um mecanismo que permite lidar com erros e condições excepcionais que podem ocorrer durante a execução de um programa. Em Java, isso é feito usando blocos try, catch, finally, e a palavra-chave throws.

## Bloco try-catch
O bloco try é usado para envolver o código que pode lançar uma exceção. O bloco catch é usado para capturar e tratar a exceção lançada pelo bloco try. Aqui está um exemplo básico:
    
 ```
    try {
        int resultado = 10 / 0; // Isso lançará uma ArithmeticException
    } catch (ArithmeticException e) {
        System.out.println("Erro: Divisão por zero!");
    }
 ``` 

## Bloco finally
O bloco finally é opcional e é sempre executado, independentemente de uma exceção ser lançada ou não. É útil para fechar recursos, como arquivos ou conexões de banco de dados:

   ```
    try {
        int resultado = 10 / 2;
    } catch (ArithmeticException e) {
        System.out.println("Erro: Divisão por zero!");
    } finally {
        System.out.println("Este bloco sempre é executado.");
    }
 ```

 ## Palavra-chave throws
A palavra-chave throws é usada para indicar que um método pode lançar uma exceção. Isso é usado para delegar a responsabilidade de tratar a exceção para o método que chama o método atual:

```
    public void metodoQuePodeLancarExcecao() throws IOException {
        throw new IOException("Erro ao ler arquivo.");
    }
 ```

## Exceções verificadas e não verificadas
Em Java, as exceções são divididas em duas categorias:
    * Exceções verificadas: Devem ser tratadas ou declaradas. São subclasses de `Exception` , mas não de `RuntimeException`.
    * Exceções não verificadas: São subclasses de `RuntimeException` e não precisam ser declaradas ou tratadas.
    
    
