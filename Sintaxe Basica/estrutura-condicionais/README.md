# Estruturas Condicionais
As estruturas condicionais são essenciais em qualquer linguagem de programação, permitindo que o fluxo do programa seja alterado com base em certas condições. Elas permitem que o código execute diferentes blocos de instruções dependendo se uma condição é verdadeira ou falsa.

Tipos de Estruturas Condicionais
1. if
A estrutura if é usada para executar um bloco de código se uma condição especificada for verdadeira.

Sintaxe
plaintext
```
if (condição) {
    // bloco de código a ser executado se a condição for verdadeira
}
Exemplo
plaintext
Copiar código
int idade = 20;
if (idade >= 18) {
    System.out.println("Você é maior de idade.");
}
```
2. if-else
A estrutura if-else permite a execução de um bloco de código quando a condição é verdadeira e outro bloco quando a condição é falsa.

Sintaxe
plaintext
```
if (condição) {
    // bloco de código a ser executado se a condição for verdadeira
} else {
    // bloco de código a ser executado se a condição for falsa
}
```
Exemplo
plaintext
```
int idade = 16;
if (idade >= 18) {
    System.out.println("Você é maior de idade.");
} else {
    System.out.println("Você é menor de idade.");
}
```
3. else if
A estrutura else if é usada para testar múltiplas condições. Se a condição inicial em um if for falsa, o programa pode testar outra condição com else if.

Sintaxe
plaintext
```
if (condição1) {
    // bloco de código a ser executado se a condição1 for verdadeira
} else if (condição2) {
    // bloco de código a ser executado se a condição2 for verdadeira
} else {
    // bloco de código a ser executado se todas as condições anteriores forem falsas
}
```
Exemplo
plaintext
```
int nota = 85;

if (nota >= 90) {
    System.out.println("Nota A");
} else if (nota >= 80) {
    System.out.println("Nota B");
} else if (nota >= 70) {
    System.out.println("Nota C");
} else {
    System.out.println("Nota F");
}
```
4. switch
A estrutura switch é uma alternativa para else if quando se deseja comparar uma variável com diversos valores específicos. É particularmente útil para simplificar código que compara a mesma expressão com diferentes constantes.

Sintaxe
plaintext
```
switch (expressão) {
    case valor1:
        // bloco de código a ser executado se expressão == valor1
        break;
    case valor2:
        // bloco de código a ser executado se expressão == valor2
        break;
    // mais cases
    default:
        // bloco de código a ser executado se nenhum dos casos anteriores for satisfeito
}
```
Exemplo
plaintext
```
int diaDaSemana = 3;

switch (diaDaSemana) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    case 3:
        System.out.println("Terça-feira");
        break;
    default:
        System.out.println("Outro dia");
        break;
}
``` 
5. Operador Ternário
O operador ternário é uma forma concisa de expressar uma simples condição if-else. Ele é útil para atribuições de valor com base em uma condição.

Sintaxe
plaintext
Copiar código
variável = (condição) ? valorSeVerdadeiro : valorSeFalso;
Exemplo
plaintext
Copiar código
int idade = 18;
String status = (idade >= 18) ? "Adulto" : "Menor de idade";
System.out.println(status);  // Output: Adulto
Conclusão
As estruturas condicionais são ferramentas poderosas que permitem que o programa execute diferentes caminhos de execução com base em condições dinâmicas. O entendimento e o uso correto dessas estruturas são fundamentais para o desenvolvimento de programas eficientes e corretos.