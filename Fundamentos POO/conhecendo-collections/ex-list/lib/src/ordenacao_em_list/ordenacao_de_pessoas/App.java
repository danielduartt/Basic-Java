package ordenacao_em_list.ordenacao_de_pessoas;

public class App {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoDePessoas = new OrdenacaoPessoas(); 
        ordenacaoDePessoas.adicionarPessoa("Daniel", 21, 1.70);
        ordenacaoDePessoas.adicionarPessoa("João",  22 , 1.85);
        ordenacaoDePessoas.adicionarPessoa("Júlia",  22 , 1.55);
        System.out.println("-------------------------------------");
        System.out.println(ordenacaoDePessoas.ordenarPorAltura());
        System.out.println("-------------------------------------");
        System.out.println(ordenacaoDePessoas.ordenarPorIdade());
    }
}
