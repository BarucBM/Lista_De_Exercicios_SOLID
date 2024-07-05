public class PagPaypal implements MetodoPagamento{

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado com Paypal!");
    }
}
