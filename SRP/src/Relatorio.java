public class Relatorio {
    public Relatorio() {
    }

    public String criaRelatorio(Venda venda){
        String relatorio = "\nID: " + venda.getId() + "\n" +
                "Valor: " + venda.getValor() + "\n" +
                "Quantidade de itens:" + venda.getQtdItens() + "\n" +
                "Vendedor: " + venda.getVendedor() + "\n";

        System.out.println("Relatório da venda " + venda.getId() + " gerado!");
        return relatorio;

    }
}
