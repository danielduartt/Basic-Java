public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void deposito(double valor){
        super.saldo += valor;
    };

    @Override
    public void saque(double valor) {
        try {
            super.saldo -= valor;
        } catch (Exception e) {
            throw new RuntimeException("Saldo negativo....");
        }

    }
    @Override
    public void transferencia(double valor, Conta contaDestino){
        this.saque(valor);
        contaDestino.deposito(valor);
    }

    public void exibirInformacoesCP(){
        System.out.println("=========== Extrato Conta Poupança ==========");
        System.out.println(super.imprimirAtributos());
    }

}
