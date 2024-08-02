import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Receber Dados via Terminal:
        Scanner entrada = new Scanner(System.in); // Instancio um objeto do tipo scanner 

        System.out.print("Por favor, Digite o seu nome: ");
        String nome = entrada.nextLine(); 
        System.out.print("Certo! Agora me informe o número de sua agência: "); 
        String agencia =entrada.nextLine(); 
        System.out.print("Quase lá! Agora me informe o número de sua conta: "); 
        int numero = entrada.nextInt(); 
        System.out.print("Por último! Me informe seu saldo: "); 
        double saldo = entrada.nextDouble(); 

        Cliente cliente = new Cliente(nome); 
        Conta conta = new Conta(numero, agencia, cliente, saldo); 
        System.out.println("------------------------------------------------------------");
        conta.imprimirMensagem();

        entrada.close();
    }
}
