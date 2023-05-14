import java.util.Set;
import java.util.TreeSet;

public class Banco {
    private static Set<String> clientes = new TreeSet<>();

    public static void addCliente(String cliente) {
        clientes.add(cliente.toUpperCase());
    }

    public static Set<String> getClientes() {
        return clientes;
    }
}
