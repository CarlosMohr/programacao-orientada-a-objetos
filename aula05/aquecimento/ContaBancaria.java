package aula05.aquecimento;

import java.util.ArrayList;

public abstract class ContaBancaria {

    private Titular titular;
    protected Double saldo;
    protected ArrayList<Double> movimentacoes = new ArrayList<>();

    public Titular getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public int getOperacoes() {
        return movimentacoes.size();
    }

    public void setTitular(Titular novo) {
        if (novo == null) {
            System.out.println("Titular inválido!");
            return;
        }
        titular = novo;
    }

    ContaBancaria(Titular titular, Double saldoInicial) {
        this.titular = titular;
        if (saldoInicial == null || saldoInicial < 0) {
            System.out.println("Saldo inicial inválido! A conta será aberta com saldo 0.");
            this.saldo = 0.0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido! O valor do depósito deve ser maior que zero.");
            return;
        }
        saldo += valor;
        movimentacoes.add(valor);
        System.out.println("Depósito realizado com sucesso! Novo saldo: " + saldo);
    }

    abstract void sacar(double valor);

    void exibirSaldo() {
        System.out.println("Titular: " + titular.getNome() + "\nSaldo: " + saldo);
    }

    void exibirExtrato() {
        System.out.println("Extrato de " + titular.getNome() + ":");
        for (Double movimentacao : movimentacoes) {
            System.out.println(movimentacao);
        }
        System.out.println("Saldo atual: " + saldo);
    }

    Double totalDepositado() {
        double total = 0;
        for (Double movimentacao : movimentacoes) {
            if (movimentacao > 0) {
                total += movimentacao;
            }
        }
        return total;
    }

    Double maiorSaque() {
        Double maior = null;
        for (Double movimentacao : movimentacoes) {
            if (movimentacao < 0 && (maior == null || movimentacao < maior)) {
                maior = movimentacao;
            }
        }
        return maior == null ? 0.0 : -maior;
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
        movimentacoes.add(-valor);
        contaDestino.saldo += valor;
        contaDestino.movimentacoes.add(valor);
        System.out.println("Transferência realizada com sucesso! Novo saldo: " + saldo);
    }
}
