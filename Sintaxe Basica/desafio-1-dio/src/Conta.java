public class Conta {
    /*
     | Atributo      | Tipo    | Exemplo      
     | ------------- | ------- | ------------ 
     | Numero        | Inteiro | 1021         
     | Agencia       | Texto   | 067-8        
     | Nome Cliente  | Texto   | MARIO ANDRADE 
     | Saldo         | Decimal | 237.48       
     */

    int numero; 
    String agencia; 
    Cliente cliente; 
    double saldo; 

    // Construtor da classe Conta
    public Conta(int numero, String agencia, Cliente cliente, double saldo) {
        this.numero = numero; 
        this.agencia = agencia; 
        this.cliente = cliente;
        this.saldo = saldo; 
    }

    public void imprimirMensagem() {
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo % .2f já está disponível para saque",
        this.cliente.nome,
        this.agencia,
        this.numero,
        this.saldo);
    }





}
