public class Conta {

    private String nome;
    private double amount;

    Conta(String nome, double amount)
    {
        this.nome = nome;
        this.amount = amount;
    }
    
    public void depositar(double quantia)
    {
        amount += quantia;
    }

    public void getSaudo()
    {
        System.out.printf("%s possui R$ %.2f\n", nome, amount);
    }

    public void sacar(double quantia)
    {
        if(amount - quantia  < 0)
        {
            System.out.printf("%s voce nao possui saldo suficiente\n",nome);
        } 
        else {
            amount -= quantia;
        }
    }
}
