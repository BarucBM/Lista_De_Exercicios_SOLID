import Descontos.Desconto;

public class Pedido {
    double valor;
    Desconto desconto;

    public Pedido(double valor, Desconto desconto) {
        this.valor = valor;
        this.desconto = desconto;
    }

    public double valorFinal(){
        return this.valor - desconto.calculaDesconto(valor);
    }
}
