package Descontos;

public class DescontoFuncPubl implements Desconto {

    @Override
    public double calculaDesconto(double valor) {
        return valor*0.10;
    }
}
