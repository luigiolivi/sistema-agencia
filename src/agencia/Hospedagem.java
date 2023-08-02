package agencia;

public class Hospedagem {
    private String descricao;
    private float diaria;

    public Hospedagem(String descricao, float diaria) {
        this.descricao = descricao;
        this.diaria = diaria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getDiaria() {
        return diaria;
    }

    public void setDiaria(float diaria) {
        this.diaria = diaria;
    }
}
