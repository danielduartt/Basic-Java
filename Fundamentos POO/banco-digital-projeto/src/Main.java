public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        cliente1.setNome("Daniel");
        cliente2.setNome("José");
        ContaCorrente cc = new ContaCorrente(cliente1);
        ContaCorrente cc2 = new ContaCorrente(cliente2);
        cc.deposito(500);
        cc.transferencia(100, cc2);
        cc.saque(200);
        cc.exibirInformacoesCC();
        cc2.exibirInformacoesCC();
        banco.cadastrarConta(cc);
        banco.cadastrarConta(cc2);
        banco.exibirContas();
        banco.exibirClientes();

    }
}
