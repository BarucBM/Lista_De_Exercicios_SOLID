public class Main {
    public static void main(String[] args) {
        Venda venda = new Venda(282, 105, 8, "Claudio");

        Relatorio relatorio = new Relatorio();
        String conteudo = relatorio.criaRelatorio(venda);

        Impressao impressao = new Impressao();

        impressao.imprimir(conteudo);


    }
}