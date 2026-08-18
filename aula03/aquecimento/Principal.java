package aula03.aquecimento;

public class Principal {
    public Principal() {
    }

    public static void main(String[] args) {
        Titular titular1 = new Titular("João", "123.456.789-00", "01/01/1990");
        Titular titular2 = new Titular("Maria", "987.654.321-00", "01/01/1990");

        ContaBancaria conta1 = new ContaBancaria(titular1, 1000.00);
        ContaBancaria conta2 = new ContaBancaria(titular2, 2000.00);

        conta1.depositar(500.00);
        conta1.sacar(200.00);
        conta1.exibirSaldo();
        conta1.tranferir(300.00, conta2);
        conta1.aplicarRendimento(5.0);
        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
