package petcare.servico;

// [POLIMORFISMO] banho e tosa: preço base com 10% de desconto
public class BanhoTosa extends Servico {

    public BanhoTosa(String nome, double precoBase, int duracao) {
        super(nome, precoBase, duracao);
    }

    @Override
    public double calcularValor() {
        return getPrecoBase() * 0.90;
    }
}
