package aula04.exercicio1;

public class Titular {
    private String nome;
    private String cpf;
    private String dataNasc;

    Titular(String nome, String cpf, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    @Override
    public String toString() {
        return nome;
    }
}
