import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> constasBanco = new ArrayList<>();

    public void cadastrarConta(Conta conta){
        constasBanco.add(conta);
    }
    public void exibirClientes(){
        constasBanco.stream().map(Conta::getCliente).distinct().forEach(cliente -> System.out.println(STR."Nome: \{cliente.getNome()}"));
    }
    public void exibirContas(){
        System.out.println(constasBanco);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
