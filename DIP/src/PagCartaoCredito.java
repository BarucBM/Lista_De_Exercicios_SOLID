public class PagCartaoCredito implements  MetodoPagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado com cartão de crédito!");
    }
}
