public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, Mundo!");

        String meuNome = "Daniel";

        int anoFabricacao = 2022;

        boolean type = true;

        String primeiroNome = "Daniel"; 
        String segundoNome = "Duarte"; 
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome); 
    }
}
