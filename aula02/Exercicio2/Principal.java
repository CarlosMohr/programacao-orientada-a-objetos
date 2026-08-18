package aula02.Exercicio2;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Notebook";
        produto1.preco = 3500.00;
        produto1.estoque = 10;

        produto1.apresentarDados();

        produto1.venderProduto( 10);
        produto1.venderProduto( 10);
    }
}   
