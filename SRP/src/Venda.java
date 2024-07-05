public class Venda {
    protected int id;
    protected float valor;
    protected int qtdItens;
    protected String vendedor;

    public Venda(int id, float valor, int qtdItens, String vendedor) {
        this.id = id;
        this.valor = valor;
        this.qtdItens = qtdItens;
        this.vendedor = vendedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }


}
