public abstract class Conta {
    int id;
    String proprietario;
    double saldo;

    public Conta(int id, String proprietario, double saldo) {
        this.id = id;
        this.proprietario = proprietario;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }
    public String getProprietario() {
        return proprietario;
    }
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double deposito) {
        this.saldo = this.saldo + deposito;
    }

    public void sacar(double valor){
        if(this.getSaldo() > valor){
            this.saldo = this.getSaldo() - valor;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
}
