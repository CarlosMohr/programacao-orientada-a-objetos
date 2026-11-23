package petcare.servico;

// [POLIMORFISMO] vacina: preço base + custo da dose
public class Vacina extends Servico {
    private double custoDose;

    public Vacina(String nome, double precoBase, int duracao, double custoDose) {
        super(nome, precoBase, duracao);
        this.custoDose = custoDose;
    }

    @Override
    public double calcularValor() {
        return getPrecoBase() + custoDose;
    }
}
