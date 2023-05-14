public class Main {
    public static void main(String[] args) {

        Conta ccEsdras = new ContaCorrente(new Cliente("esdras"));
        Conta cpEsdras = new ContaPoupanca(new Cliente("esdras"));
        Conta cpLaura = new ContaPoupanca(new Cliente("laura"));
        Conta ccPedro = new ContaCorrente(new Cliente("pedro"));
        Conta cpPedro = new ContaCorrente(new Cliente("pedro"));
        Conta ccMaria = new ContaCorrente(new Cliente("maria"));


        ccEsdras.depositar(100);
        ccEsdras.transferir(50, cpLaura);

        ccEsdras.imprimirExtrato();
        cpLaura.imprimirExtrato();

        //Lista de clientes do banco
        System.out.println(Banco.getClientes());

    }
}
