public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        Banco.addCliente(cliente.getNome());
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println(cliente.getNome().toUpperCase() + ", você acaba de fazer um saque de R$" + String.format("%.2f", valor) + ". Saldo atual: R$" + String.format("%.2f", saldo) + "\n");
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println(cliente.getNome().toUpperCase() + ", você acaba de receber um depósito de R$" + String.format("%.2f", valor) + ". Saldo atual: R$" + String.format("%.2f", saldo) + "\n");
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        saldo -= valor;
        System.out.println(cliente.getNome().toUpperCase() + ", você acaba de fazer uma transferência de R$" + String.format("%.2f", valor) + " para a conta de " + contaDestino.cliente.getNome() + ". Saldo atual: R$" + String.format("%.2f", saldo) + "\n");
        contaDestino.depositar(valor);
    }

    protected void imprimirInfos() {
        System.out.printf("Cliente: %s%n", this.cliente.getNome().toUpperCase());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Conta: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n\n", this.saldo);
    }

}
