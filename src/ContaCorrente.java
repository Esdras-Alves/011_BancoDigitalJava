public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        System.out.println("Olá " + cliente.getNome().toUpperCase() + ", obrigado por criar uma conta corrente em nosso banco, sua agência é: " + agencia + ", conta c.: " + numero + "\n");
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfos();
    }
}