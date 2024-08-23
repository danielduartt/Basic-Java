package pesquisa_em_map.estoque_produtos;

import java.util.Map; 
import java.util.HashMap;

public class EstoqueProdutos {
    private Map<String, Produto> estoqueProdutoMap; 

    public EstoqueProdutos(){
        estoqueProdutoMap = new HashMap<>(); 
    }

    public void addProduto(String cod, String nome, int quantidade, double preco){
        estoqueProdutoMap.put(nome, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        for(Produto p : estoqueProdutoMap.values()){
            System.out.println(p);
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d; 
        for(Produto p : estoqueProdutoMap.values()){
            valorTotal += (p.getPreco() * p.getQuantidade()); 
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null; 
        double maiorPreco = Double.MIN_VALUE; 
        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p; 
                }
            }
        }
        return produtoMaisCaro; 
    }

}
