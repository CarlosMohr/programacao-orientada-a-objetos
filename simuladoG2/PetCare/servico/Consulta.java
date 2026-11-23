package simuladoG2.PetCare.servico;


public class Consulta extends Servico{
    public Consulta(String nome, double precoBase, int duracao) {
        super(nome, precoBase, duracao);
    }

    @Override 
    public double CalcularPreco() {
        return getPrecoBase();
    }  
}
