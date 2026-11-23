package petcare.servico;

// [POLIMORFISMO] consulta: preço base puro
public class Consulta extends Servico {

    public Consulta(String nome, double precoBase, int duracao) {
        super(nome, precoBase, duracao);
    }

    @Override
    public double calcularValor() {
        return getPrecoBase();
    }
}
