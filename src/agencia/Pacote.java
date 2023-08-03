package agencia;

public class Pacote {
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int quantidadeDias;
    private int margemPorcentagem;
    private float valor;
    private float taxa;

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public int getMargemPorcentagem() {
        return margemPorcentagem;
    }

    public void setMargemPorcentagem(int margemPorcentagem) {
        this.margemPorcentagem = margemPorcentagem;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }
    
    
    
    public float calcularHospedagem() {
        return (quantidadeDias * hospedagem.getDiaria());
    }
    
    public float calcularLucro() {
        return ((1 - (margemPorcentagem / 100)) * valor);
    }
    
    public float calcularTotal() {
        return (transporte.getValor() + calcularHospedagem() + calcularLucro() + taxa);
    }
}
