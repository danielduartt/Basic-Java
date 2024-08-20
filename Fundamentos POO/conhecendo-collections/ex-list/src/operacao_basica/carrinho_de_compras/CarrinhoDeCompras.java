package operacao_basica.carrinho_de_compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaDeitens; 
    public CarrinhoDeCompras(){
        this.listaDeitens = new ArrayList<>(); 
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaDeitens.add(new Item(nome, preco, quantidade)); 
    }

    public void removerItem(String nome){
        List<Item> itens_remove = new ArrayList<>(); 
        for (Item item : listaDeitens){
            if(nome.equalsIgnoreCase(item.getNome())){
                itens_remove.add(item);
            }
        }
        listaDeitens.removeAll(itens_remove); 
    }

    public void calcularValorTotal(){
        double soma = 0;
        for(Item i : listaDeitens){
            soma = soma + (i.getPreco() * i.getQuantidade()); 
        }
        System.out.println("O valor total é: " + soma);
    }

    public void exibirItens(){
        for( Item i: listaDeitens){
            i.exibirItem();
        }

    }
    
}
