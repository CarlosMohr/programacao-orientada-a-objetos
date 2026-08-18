package aula03.Exercicio2;

public class Paciente {
    String nome;
    int telefone;

    Paciente(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
