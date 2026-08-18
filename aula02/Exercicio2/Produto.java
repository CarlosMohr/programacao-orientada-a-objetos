package aula02.Exercicio2;

public class Produto {
    String nome;
    double preco;
    int estoque;
    

    void apresentarDados() {
        System.out.println("Produto: " + nome + "\nPreço: " + preco + "\nEstoque: " + estoque);
    }
    int venderProduto(int quant) {
        if (estoque > 0) {
            estoque = estoque - quant;
            System.out.println(quant + " unidades vendidas com sucesso! \nEstoque atual: " + estoque);
        } else {
            System.out.println("Produto fora de estoque!");
        }
        return estoque;
    }
}
