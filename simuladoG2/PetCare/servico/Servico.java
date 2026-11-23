package simuladoG2.PetCare.servico;

// [ABSTRAÇÃO] não existe "serviço genérico", só os tipos concretos
// [HERANÇA] Consulta, Vacina, BanhoTosa e Hospedagem herdam daqui
// [OCP] serviço novo = classe nova, sem mexer no resto
public abstract class Servico implements Cobravel, Agendavel {
    private String nome;
    private double precoBase;
    private int duracao; // em minutos

    public Servico(String nome, double precoBase, int duracao) {
        if (precoBase < 0 || duracao < 0) {
            throw new IllegalArgumentException("Preço base e duração não podem ser negativos");
        }
        this.nome = nome;
        this.precoBase = precoBase;
        this.duracao = duracao;
    }

    // Cada tipo de serviço é obrigado a dizer como calcula o preço
    @Override
    public abstract double CalcularPreco();

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    @Override
    public int getDuracao() {
        return duracao;
    }
}
