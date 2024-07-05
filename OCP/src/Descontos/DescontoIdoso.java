package Descontos;

public class DescontoIdoso implements Desconto {
    @Override
    public double calculaDesconto(double valor) {
        return valor *0.20;
    }
}
