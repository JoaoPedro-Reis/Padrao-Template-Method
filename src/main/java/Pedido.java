public abstract class Pedido {

    private int numero;
    protected String nomeCliente;
    private float valorLanche;
    private float distanciaKm;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getValorLanche() {
        return valorLanche;
    }

    public void setValorLanche(float valorLanche) {
        this.valorLanche = valorLanche;
    }

    public float getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(float distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public float calcularTotal() {
        return this.valorLanche + this.calcularTaxaEntrega();
    }

    public abstract float calcularTaxaEntrega();

    public String getTipo() {
        return "Pedido";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "numero=" + this.numero +
                ", cliente='" + this.nomeCliente + '\'' +
                ", total=" + this.calcularTotal() +
                '}';
    }
}