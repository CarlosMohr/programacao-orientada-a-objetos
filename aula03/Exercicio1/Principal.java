package aula03.Exercicio1;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "joao@email.com");
        Produto produto1 = new Produto("Notebook", 2500.0);
        Produto[] produtos1 = {produto1};
        int[] quantidades1 = {2};
        Pedido pedido1 = new Pedido(cliente1, produtos1, quantidades1);
        pedido1.resumo();

        Cliente cliente2 = new Cliente("Maria", "maria@email.com");
        Produto produto2 = new Produto("Smartphone", 1500.0);
        Produto produto3 = new Produto("Fone de ouvido", 200.0);
        Produto[] produtos2 = {produto2, produto3};
        int[] quantidades2 = {1, 3};
        Pedido pedido2 = new Pedido(cliente2, produtos2, quantidades2);
        pedido2.resumo();
    }
}
