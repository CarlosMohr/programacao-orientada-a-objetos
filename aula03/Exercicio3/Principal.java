package aula03.Exercicio3;

public class Principal {
    public static void main(String[] args) {
        Autor autor1 = new Autor("George Orwell", "Britânico");
        Autor autor2 = new Autor("J.K. Rowling", "Britânica");

        Livro livro1 = new Livro("1984", autor1, 1949);
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", autor2, 1997);
        Livro livro3 = new Livro("A Revolução dos Bichos", autor1, 1945);

        livro1.Emprestar();
        livro2.Emprestar();
        livro3.Emprestar();

        livro1.Devolver();
        livro2.Devolver();
        livro3.Devolver();

    }
}
