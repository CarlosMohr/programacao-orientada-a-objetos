package aula03.Exercicio1;

public class Pedido {
    Cliente cliente;
    Produto[] produtos;
    int[] quantidades;
    Pedido(Cliente cliente, Produto[] produtos, int[] quantidades) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.quantidades = quantidades;
    }
    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", produtos=" + java.util.Arrays.toString(produtos) +
                ", quantidades=" + java.util.Arrays.toString(quantidades) +
                '}';
    }   

    void resumo() {
        System.out.println("Cliente: " + cliente);
        for (int i = 0; i < produtos.length; i = i + 1) {
            System.out.println("Produto: " + produtos[i]);
            System.out.println("Quantidade: " + quantidades[i]);
            System.out.println("Total: R$" + (produtos[i].preco * quantidades[i]));
        }
    }

}
