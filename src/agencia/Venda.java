package agencia;

public class Venda {
    private String cliente;
    private String formaPagamento;
    private Pacote pacote;
    private float valor;
    private float dolar;

    public Venda(String cliente, String formaPagamento, Pacote pacote) {
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
        this.pacote = pacote;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }
    
    public float converterDolar() {
        return (valor * dolar);
    }
    
    public void mostrarTotalPacote() {
        System.out.println("Total do pacote em dólares: " + pacote.calcularTotal());
        System.out.println("Total do pacote em reais: " + converterDolar());
    }
}
