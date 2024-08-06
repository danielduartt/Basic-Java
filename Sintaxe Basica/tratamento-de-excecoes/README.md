<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tratamento de Exceções em Java</title>
</head>
<body>
    <h1>Tratamento de Exceções em Java</h1>
    <p>O tratamento de exceções é um mecanismo que permite lidar com erros e condições excepcionais que podem ocorrer durante a execução de um programa. Em Java, isso é feito usando blocos <code>try</code>, <code>catch</code>, <code>finally</code>, e a palavra-chave <code>throws</code>.</p>

    <h2>Bloco try-catch</h2>
    <p>O bloco <code>try</code> é usado para envolver o código que pode lançar uma exceção. O bloco <code>catch</code> é usado para capturar e tratar a exceção lançada pelo bloco <code>try</code>. Aqui está um exemplo básico:</p>

    <pre><code>
    try {
        int resultado = 10 / 0; // Isso lançará uma ArithmeticException
    } catch (ArithmeticException e) {
        System.out.println("Erro: Divisão por zero!");
    }
    </code></pre>

    <h2>Bloco finally</h2>
    <p>O bloco <code>finally</code> é opcional e é sempre executado, independentemente de uma exceção ser lançada ou não. É útil para fechar recursos, como arquivos ou conexões de banco de dados:</p>

    <pre><code>
    try {
        int resultado = 10 / 2;
    } catch (ArithmeticException e) {
        System.out.println("Erro: Divisão por zero!");
    } finally {
        System.out.println("Este bloco sempre é executado.");
    }
    </code></pre>

    <h2>Palavra-chave throws</h2>
    <p>A palavra-chave <code>throws</code> é usada para indicar que um método pode lançar uma exceção. Isso é usado para delegar a responsabilidade de tratar a exceção para o método que chama o método atual:</p>

    <pre><code>
    public void metodoQuePodeLancarExcecao() throws IOException {
        throw new IOException("Erro ao ler arquivo.");
    }
    </code></pre>

    <h2>Exceções verificadas e não verificadas</h2>
    <p>Em Java, as exceções são divididas em duas categorias:</p>
    <ul>
        <li><strong>Exceções verificadas:</strong> Devem ser tratadas ou declaradas. São subclasses de <code>Exception</code>, mas não de <code>RuntimeException</code>.</li>
        <li><strong>Exceções não verificadas:</strong> São subclasses de <code>RuntimeException</code> e não precisam ser declaradas ou tratadas.</li>
    </ul>
</body>
</html>
