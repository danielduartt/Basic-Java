
    # Tratamento de Exceções em Java
    <p>O tratamento de exceções é um mecanismo que permite lidar com erros e condições excepcionais que podem ocorrer durante a execução de um programa. Em Java, isso é feito usando blocos <code>try</code>, <code>catch</code>, <code>finally</code>, e a palavra-chave <code>throws</code>.</p>

    ## Bloco try-catch
    <p>O bloco <code>try</code> é usado para envolver o código que pode lançar uma exceção. O bloco <code>catch</code> é usado para capturar e tratar a exceção lançada pelo bloco <code>try</code>. Aqui está um exemplo básico:</p>

    ```
    try {
        int resultado = 10 / 0; // Isso lançará uma ArithmeticException
    } catch (ArithmeticException e) {
        System.out.println("Erro: Divisão por zero!");
    }
    ``` 

    ## Bloco finally
    <p>O bloco <code>finally</code> é opcional e é sempre executado, independentemente de uma exceção ser lançada ou não. É útil para fechar recursos, como arquivos ou conexões de banco de dados:</p>

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
    <p>A palavra-chave <code>throws</code> é usada para indicar que um método pode lançar uma exceção. Isso é usado para delegar a responsabilidade de tratar a exceção para o método que chama o método atual:</p>

    ```
    public void metodoQuePodeLancarExcecao() throws IOException {
        throw new IOException("Erro ao ler arquivo.");
    }
    ```

    ## Exceções verificadas e não verificadas
    <p>Em Java, as exceções são divididas em duas categorias:</p>
        * <strong>Exceções verificadas:</strong> Devem ser tratadas ou declaradas. São subclasses de `Exception` , mas não de `RuntimeException`.
        * <strong>Exceções não verificadas:</strong> São subclasses de `RuntimeException` e não precisam ser declaradas ou tratadas.
    
