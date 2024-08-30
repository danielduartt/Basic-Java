public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
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

    public void exibirInformacoesCC(){
        System.out.println("=========== Extrato Conta Corrente ==========");
        System.out.println(super.imprimirAtributos());
    }
}
