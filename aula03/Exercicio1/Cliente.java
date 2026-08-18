package aula03.Exercicio1;

public class Cliente {
    String nome;
    String email;

    Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    @Override
    public String toString() {
        return nome;
    }
}
