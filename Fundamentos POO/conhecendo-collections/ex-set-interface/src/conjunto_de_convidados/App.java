package conjunto_de_convidados;

public class App {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados(); 
        conjuntoConvidados.adicionarConvidado("Daniel", 20203);
        conjuntoConvidados.adicionarConvidado("Maria", 2245);
        conjuntoConvidados.adicionarConvidado("Lídia", 52);
        conjuntoConvidados.adicionarConvidado("Suellem", 2234);
        System.out.println("--------------------------------------------------------------------");
        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerConvidado(20203);
        System.out.println("--------------------------------------------------------------------");
        conjuntoConvidados.exibirConvidados();

    }
}
