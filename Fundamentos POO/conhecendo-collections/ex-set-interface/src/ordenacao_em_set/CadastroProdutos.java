package ordenacao_em_set;

import java.util.Set; 
import java.util.HashSet; 
import java.util.TreeSet; ; 
public class CadastroProdutos {
     private Set<Objeto> listaCadastroProdutos;

    public CadastroProdutos() {
        this.listaCadastroProdutos = new HashSet<>(); // HashSet não possui uma ordem exata, mas possui um desempenho bom na busca
    } 

    public void adicionarConvidado(String nome, double preco, int quantidade, long cod){
        listaCadastroProdutos.add(new Objeto(nome, preco, quantidade, cod));
    }

    public Set<Objeto> exibirProdutosPorNome(){
        Set<Objeto> produtosPorNome = new TreeSet<>(listaCadastroProdutos); //o treeset já consegue organizar por nome 
        return produtosPorNome;
    }

    public Set<Objeto>  exibirProdutosPorPreco(){
        Set<Objeto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        listaCadastroProdutos.addAll(listaCadastroProdutos);
        return produtosPorPreco; 
    }

}
