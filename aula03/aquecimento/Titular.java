package aula03.aquecimento;

public class Titular {
    String nome;
    String cpf;
    String dataNasc;

    Titular(String nome, String cpf, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return nome;
    }
}
