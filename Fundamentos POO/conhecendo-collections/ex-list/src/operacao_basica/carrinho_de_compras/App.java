package operacao_basica.carrinho_de_compras;

public class App {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(); 
        carrinho.adicionarItem("Caneta", 15.5, 2);
        carrinho.adicionarItem("Caderno", 24.5, 5);
        carrinho.adicionarItem("Teste", 24.5, 5);
        carrinho.exibirItens();
        carrinho.removerItem("Teste");
        carrinho.exibirItens();
        carrinho.calcularValorTotal(); 
    }
}
