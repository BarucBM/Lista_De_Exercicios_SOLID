package Descontos;

public class DescontoEstudante implements Desconto {
    @Override
    public double calculaDesconto(double valor) {
        return valor * 0.15;
    }
}
