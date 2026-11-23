package simuladoG2.PetCare.servico;

public class Hospedagem extends Servico {
    private int diasHospedado;
    public Hospedagem(String nome, double precoBase, int duracao, int diasHospedado) {
        super(nome, precoBase, duracao);
        this.diasHospedado = diasHospedado;
    }

    int getDiasHospedado() {
        return diasHospedado;
    }

    @Override
    public double CalcularPreco() {
        return getPrecoBase() * diasHospedado;
    }
    
}
