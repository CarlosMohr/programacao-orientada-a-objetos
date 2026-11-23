package simuladoG2.PetCare.servico;

public class BanhoTosa extends Servico{
    public BanhoTosa(String nome, double precoBase, int duracao) {
        super(nome, precoBase, duracao);
    }

    @Override
    public double CalcularPreco() {
        return getPrecoBase() * 0.9;
    }
    
}
