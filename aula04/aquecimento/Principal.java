package aula04.aquecimento;

public class Principal {
    public Principal() {
    }

    public static void main(String[] args) {
        Titular titular1 = new Titular("João", "123.456.789-00", "01/01/1990");

        ContaBancaria conta1 = new ContaBancaria(titular1, 1000.00);

        conta1.exibirSaldo(); // Exibe o saldo da conta1 negativado e sem nome do titular

    }
}
