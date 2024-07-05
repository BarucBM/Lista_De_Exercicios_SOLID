public class ContaPoupanca extends Conta {
    int juros;


    public ContaPoupanca(int id, String proprietario, double saldo, int juros) {
        super(id, proprietario, saldo);
        this.juros = juros;
    }
    
}
