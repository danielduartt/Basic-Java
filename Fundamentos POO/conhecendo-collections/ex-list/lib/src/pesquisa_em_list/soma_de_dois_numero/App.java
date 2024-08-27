package pesquisa_em_list.soma_de_dois_numero;

public class App {
    public static void main(String[] args) {
        SomaNumeros somanumeros = new SomaNumeros(); 
        somanumeros.adicionarNumero(20);
        somanumeros.adicionarNumero(30);
        somanumeros.adicionarNumero(50);
        System.out.println(somanumeros.calcularSoma());
        System.out.println( somanumeros.encontrarMaiorNumero());
        System.out.println(somanumeros.encontrarMenorNumero());
        System.err.println("--------------------------");
        somanumeros.exibirNumeros();
    }
}
