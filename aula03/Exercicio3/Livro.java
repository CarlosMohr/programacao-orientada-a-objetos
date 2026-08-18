package aula03.Exercicio3;

public class Livro {
    String titulo;
    Autor autor;
    int ano;
    Boolean emprestado;

    Livro(String titulo, Autor autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = false;

    }

    void ExibirFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor.nome);
        System.out.println("Nacionalidade do Autor: " + autor.nacionalidade);
        System.out.println("Ano de Publicação: " + ano);
        System.out.println("Emprestado: " + (emprestado ? "Sim" : "Não"));}

    void Emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("O livro '" + titulo + "' foi emprestado.");
        } else {
            System.out.println("O livro '" + titulo + "' já está emprestado.");
        }
    }

    void Devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("O livro '" + titulo + "' foi devolvido.");
        } else {
            System.out.println("O livro '" + titulo + "' não está emprestado.");
        }
    }
}

