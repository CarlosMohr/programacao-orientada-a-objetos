package petcare.servico;

// [POLIMORFISMO] hospedagem: preço base (diária) x número de diárias
public class Hospedagem extends Servico {
    private int diarias;

    public Hospedagem(String nome, double precoBase, int duracao, int diarias) {
        super(nome, precoBase, duracao);
        this.diarias = diarias;
    }

    @Override
    public double calcularValor() {
        return getPrecoBase() * diarias;
    }
}
