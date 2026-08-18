package aula02.Exercicio4;

public class ContaBancaria {
    String titular;
    Double saldo;

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido! O valor do depósito deve ser maior que zero.");
            return;
        }
        saldo += valor;
        System.out.println("Depósito realizado com sucesso! Novo saldo: " + saldo);
    }

    void sacar(double valor, Double saldo) {
        if (valor <= 0) {
            System.out.println("Valor inválido! O valor do saque deve ser maior que zero.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo -= valor;
        System.out.println("Saque realizado com sucesso! Novo saldo: " + saldo);
    }
    void exibirSaldo() {
        System.out.println("Titular: " + titular + "\nSaldo: " + saldo);
    }

    void tranferir(double valor, ContaBancaria contaDestino) {
        if (valor <= 0) {
            System.out.println("Valor inválido! O valor da transferência deve ser maior que zero.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo -= valor;
        contaDestino.saldo += valor;
        System.out.println("Transferência realizada com sucesso! Novo saldo: " + saldo);
    }
}
