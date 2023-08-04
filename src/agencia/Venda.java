package agencia;

public class Venda {
    private String cliente;
    private String formaPagamento;
    private Pacote pacote;
    private float dolar;


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

    public float getDolar() {
        return dolar;
    }

    public void setDolar(float dolar) {
        this.dolar = dolar;
    }
    
    
    public float converterDolar() {
        return (pacote.getValorPacote() * dolar);
    }
    
    public void mostrarTotalPacote() {
        System.out.println("Total do pacote em dólares: " + pacote.getValorPacote());
        System.out.println("Total do pacote em reais: " + converterDolar());
    }
}
