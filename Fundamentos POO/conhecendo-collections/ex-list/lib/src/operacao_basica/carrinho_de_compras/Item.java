package operacao_basica.carrinho_de_compras;

public class Item {
    private String nome; 
    private double preco; 
    private int quantidade;

    public Item(String nome, double preco, int quantidade){
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    public void exibirItem(){
        System.out.println("-------------------------");
        System.err.println("Nome: " + getNome());
        System.err.println("Preço: " + getPreco());
        System.err.println("Quantidade: " + getQuantidade());
        System.out.println("-------------------------");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    } 
    
}
