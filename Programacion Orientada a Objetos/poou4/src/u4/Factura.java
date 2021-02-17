package u4;

public class Factura extends Precio {

    private String emisor;
    private String cliente;

    public Factura() {
    }

    public Factura(String emisor, String cliente, double importeNeto, double porcentajeIva) {
        super(importeNeto, porcentajeIva);
        this.emisor = emisor;
        this.cliente = cliente;
    }

    public String getEmisor() {
        return emisor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "**********Factura**********" + "\n Emisor: " + emisor + "\n Cliente: " + cliente + "\n" + super.toString();
    }

    public void ImprimirFactura(){
        System.out.println(this.toString());
    }
}
