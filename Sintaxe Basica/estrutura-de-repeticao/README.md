# Estrutura de Repetição em Java
Introdução
As estruturas de repetição, também conhecidas como laços ou loops, são fundamentais na programação para executar um bloco de código várias vezes. Em Java, as estruturas de repetição mais comuns são for, while e do-while. Este documento fornece uma visão geral dessas estruturas, suas sintaxes e exemplos de uso.

## Estrutura de Repetição for
O loop for é utilizado quando sabemos de antemão quantas vezes um bloco de código deve ser executado. Ele é composto de três partes: inicialização, condição e incremento.

Sintaxe
```
for (inicialização; condição; incremento) {
    // Código a ser executado
}
```
Exemplo
```
for (int i = 0; i < 5; i++) {
    System.out.println("Iteração: " + i);
}
```
Neste exemplo, a variável i é inicializada com 0, a condição i < 5 é verificada em cada iteração e i é incrementado em 1 a cada loop. O código dentro do bloco é executado enquanto a condição for verdadeira.

## Estrutura de Repetição while
O loop while é utilizado quando não sabemos exatamente quantas vezes o bloco de código deve ser executado e depende de uma condição ser verdadeira.

Sintaxe
```
while (condição) {
    // Código a ser executado
}
```
Exemplo
```
int count = 0;
while (count < 5) {
    System.out.println("Contagem: " + count);
    count++;
}
```
Neste exemplo, o loop continua enquanto a condição count < 5 for verdadeira. A variável count é incrementada em 1 a cada iteração.

## Estrutura de Repetição do-while
O loop do-while é semelhante ao while, mas garante que o bloco de código seja executado pelo menos uma vez, já que a condição é verificada após a execução do bloco.

Sintaxe
```
do {
    // Código a ser executado
} while (condição);
```
Exemplo
```
int count = 0;
do {
    System.out.println("Contagem: " + count);
    count++;
} while (count < 5);
```
Neste exemplo, o bloco de código é executado antes da condição count < 5 ser verificada, garantindo que a saída "Contagem: 0" seja impressa pelo menos uma vez, mesmo que a condição inicial seja falsa.

## Considerações Finais
As estruturas de repetição são essenciais para automatizar tarefas repetitivas e iterar sobre coleções de dados. É importante garantir que a condição de parada do loop seja atingida, para evitar loops infinitos que podem travar a aplicação.

Para mais detalhes sobre o uso de loops em Java, consulte a documentação oficial do Java: Java Documentation.

Contribuição
Sinta-se à vontade para contribuir com exemplos adicionais, melhorias ou correções para este documento. Você pode enviar um pull request ou abrir uma issue para sugestões.