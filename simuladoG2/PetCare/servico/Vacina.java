package simuladoG2.PetCare.servico;

public class Vacina extends Servico{
    private double precoVacina;
    public Vacina(String nome, double precoBase, int duracao, double precoVacina) {
        super(nome, precoBase, duracao);
        this.precoVacina = precoVacina;
    }
    @Override 
    public double CalcularPreco() {
        return getPrecoBase() + precoVacina;
    }
}
