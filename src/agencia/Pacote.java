package agencia;

public class Pacote {
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int quantidadeDias;
    private float valorPacote;
    
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

    public float getValorPacote() {
        return valorPacote;
    }

    public void setValorPacote(float valorPacote) {
        this.valorPacote = valorPacote;
    }
    
    
    public float calcularHospedagem() {
        return (quantidadeDias * hospedagem.getDiaria());
    }
    
    public float calcularTotal() {
        return (transporte.getValor() + calcularHospedagem());
    }
    
    public float calcularLucro(int margemPorcentagem) {
        return ((calcularTotal() * (margemPorcentagem + 100)) / 100);
    }
}
