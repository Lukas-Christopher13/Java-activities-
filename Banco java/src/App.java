public class App {
    public static void main(String[] args) throws Exception {

        Conta cliente = new Conta("Lukas", 1200.43);

        cliente.getSaldo();
        cliente.sacar(10.12);
        cliente.getSaldo();
        cliente.depositar(23.34);
        cliente.getSaldo();
        cliente.sacar(1300.0);
        cliente.getSaldo();
    }
}
