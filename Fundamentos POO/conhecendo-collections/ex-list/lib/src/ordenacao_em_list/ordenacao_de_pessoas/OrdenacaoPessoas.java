package ordenacao_em_list.ordenacao_de_pessoas;

import java.util.List; 
import java.util.ArrayList; 
import java.util.Collections; 

public class OrdenacaoPessoas {
    private List<Pessoa> pessoasList; 

    public OrdenacaoPessoas(){
        this.pessoasList = new ArrayList<>(); 
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoasList.add(new Pessoa(nome, idade, altura));
    }
    
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList); 
        Collections.sort(pessoasPorIdade); 
        return pessoasPorIdade; 
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList); 
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura()); 
        return pessoasPorAltura; 
    }

}
