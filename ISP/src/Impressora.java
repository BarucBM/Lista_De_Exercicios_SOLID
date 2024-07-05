public class Impressora implements Escanear, Faxear ,Imprimir{
    @Override
    public void escanearDocumento(String documento) {
        System.out.println("Documento escaneado!");
    }

    @Override
    public void faxearDocumento(String documento) {
        System.out.println("Documento faxeado!");
    }

    @Override
    public void imprimirDocumento(String documento) {
        System.out.println("Documento impresso!");
    }
}
