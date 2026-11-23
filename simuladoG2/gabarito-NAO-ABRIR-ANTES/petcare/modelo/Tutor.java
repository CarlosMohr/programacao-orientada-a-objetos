package petcare.modelo;

// [ENCAPSULAMENTO] atributos private, leitura só pelos getters
public class Tutor {
    private String nome;
    private String telefone;

    public Tutor(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
