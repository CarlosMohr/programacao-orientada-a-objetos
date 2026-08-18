package aula02.Exercicio4;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "João";
        conta1.saldo = 1000.0;

        ContaBancaria conta2 = new ContaBancaria();
        conta2.titular = "Maria";
        conta2.saldo = 2000.0;

        conta1.exibirSaldo();
        conta1.depositar(500.0);
        conta1.sacar(200.0, conta1.saldo);
        conta1.exibirSaldo();

        conta2.exibirSaldo();
        conta2.depositar(1000.0);
        conta2.sacar(3000.0, conta2.saldo);
        conta2.exibirSaldo();

        conta1.tranferir(300.0, conta2);
        conta1.exibirSaldo();
    }
}
