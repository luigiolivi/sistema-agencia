package agencia;

public class Pacote {
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int quantidadeDias;

    
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
    
    
    public float calcularHospedagem() {
        return (quantidadeDias * hospedagem.getDiaria());
    }
    
    public float calcularTotal() {
        return (transporte.getValor() + calcularHospedagem());
    }
    
    public float calcularLucro(int margemPorcentagem) {
        return (1 + (margemPorcentagem / 100) * calcularTotal());
    }
}
