public class App {
    public static void main(String[] args) throws Exception {

        Conta cliente = new Conta("Lukas", 1200.43);

        cliente.getSaudo();
        cliente.sacar(10.12);
        cliente.getSaudo();
        cliente.depositar(23.34);
        cliente.getSaudo();
        cliente.sacar(1300.0);
        cliente.getSaudo();
    }
}
