public abstract class Conta {
    protected static  int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    protected int agencia ;
    protected int codConta;
    protected double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.codConta = Conta.SEQUENCIAL++;
        this.cliente = cliente;
    }

    public abstract void deposito(double valor);
    public abstract void saque(double valor);
    public abstract void transferencia(double valor, Conta contaDestino);
    protected String imprimirAtributos() {
        return String.format("[Agência: %d; Conta: %d; Extrato: %.2f]", this.agencia,
                this.codConta,
                this.saldo);
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


}
