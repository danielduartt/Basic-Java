package equipamentos;
import equipamentos.funcoes.*;

public class Iphone implements ReprodutorMusical, AparelhoTelefônico, NavegadorInternet {
    public boolean estadoMusica = false; 
    private String numero_serie; 
    private String modelo; 

    public String getNumero_serie() {return numero_serie;}
    public void setNumero_serie(String numero_serie) { this.numero_serie = numero_serie;}

    public String getModelo(){ return this.modelo; }
    public void setModelo(String modelo){ this.modelo = modelo; }
// -----------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void exibirPagina(String url) {System.out.println("exibindo a pagina:" + url); }

    @Override
    public void atualizarPagina(){ System.out.println("Atualizando a página..."); } 

    @Override
    public void adicionarNovaAba() {System.out.println("Adicionando nova aba..."); }
// -----------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void ligar(String numero) { System.out.println("Ligando para o número: " + numero);  }

    @Override
    public void atender() { System.out.println("Atendendo o número...."); }

    @Override
    public void iniciarCorreioVoz() { System.out.println("Iniciando Correio de Voz"); }
// -----------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void tocar() {
        if(estadoMusica){
            System.out.println("A música já está tocando");
        }else{
            System.out.println("Tocando música");
            estadoMusica = true; 
        }
    }

    @Override
    public void pausar() {
        if (estadoMusica){
            System.out.println("Pausando a Música");
            estadoMusica = false; 
        }else{
            System.out.println("Não está tocando a música");
        }
    }

    @Override
    public void selecionarMusica(String[] musicas, int numMusica) {
        System.out.printf("Selecionando a música %s de número %d %n", musicas[numMusica], numMusica); 
        this.tocar(); // ao selecionar, já toca a música... 
    }

    public boolean isEstadoMusica() {
        return estadoMusica;
    }

    public void setEstadoMusica(boolean estadoMusica) {
        this.estadoMusica = estadoMusica;
    }
}
// -----------------------------------------------------------------------------------------------------------------------------------------
