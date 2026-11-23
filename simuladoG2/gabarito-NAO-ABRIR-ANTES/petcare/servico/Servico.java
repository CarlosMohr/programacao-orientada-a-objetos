package petcare.servico;

// [ABSTRAÇÃO] não existe "serviço genérico"
// [HERANÇA] Consulta, Vacina, BanhoTosa e Hospedagem herdam daqui
// [OCP] serviço novo = classe nova, sem mexer no resto
public abstract class Servico implements Cobravel, Agendavel {
    private String nome;
    private double precoBase;
    private int duracao; // em minutos

    public Servico(String nome, double precoBase, int duracao) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.duracao = duracao;
    }

    // Cada tipo de serviço é obrigado a dizer como calcula o valor
    @Override
    public abstract double calcularValor();

    public String getNome() {
        return nome;
    }

    protected double getPrecoBase() {
        return precoBase;
    }

    @Override
    public int getDuracao() {
        return duracao;
    }
}
