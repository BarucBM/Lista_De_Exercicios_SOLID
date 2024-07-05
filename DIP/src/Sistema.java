public class Sistema {
    MetodoPagamento metodoPag;

    public Sistema(MetodoPagamento metodoPag) {
        this.metodoPag = metodoPag;
    }

    public void pagar(double valor){
        metodoPag.pagar(valor);
    }
}
