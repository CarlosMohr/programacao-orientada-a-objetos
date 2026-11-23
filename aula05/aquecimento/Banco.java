package aula05.aquecimento;

import java.util.ArrayList;

public class Banco {

    private ArrayList<ContaBancaria> contas = new ArrayList<>();

    int abrirConta(String tipo, String nome, String cpf, String dataNasc, double saldoInicial) {
        Titular titular = new Titular(nome, cpf, dataNasc);
        ContaBancaria conta;

        if (tipo.equalsIgnoreCase("corrente")) {
            conta = new ContaCorrente(titular, saldoInicial);
        } else if (tipo.equalsIgnoreCase("poupanca")) {
            conta = new ContaPoupanca(titular, saldoInicial);
        } else {
            System.out.println("Tipo de conta inválido! Use 'corrente' ou 'poupanca'.");
            return -1;
        }

        contas.add(conta);
        return contas.size();
    }

    private ContaBancaria buscarConta(int numero) {
        if (numero < 1 || numero > contas.size()) {
            return null;
        }
        return contas.get(numero - 1);
    }

    void depositar(int numero, double valor) {
        ContaBancaria conta = buscarConta(numero);
        if (conta == null) {
            System.out.println("Conta " + numero + " não encontrada!");
            return;
        }
        conta.depositar(valor);
    }

    void sacar(int numero, double valor) {
        ContaBancaria conta = buscarConta(numero);
        if (conta == null) {
            System.out.println("Conta " + numero + " não encontrada!");
            return;
        }
        conta.sacar(valor);
    }

    void transferir(int numeroOrigem, int numeroDestino, double valor) {
        if (numeroOrigem == numeroDestino) {
            System.out.println("Não é possível transferir de uma conta para ela mesma!");
            return;
        }
        ContaBancaria origem = buscarConta(numeroOrigem);
        ContaBancaria destino = buscarConta(numeroDestino);
        if (origem == null || destino == null) {
            System.out.println("Conta de origem ou destino não encontrada!");
            return;
        }
        origem.tranferir(valor, destino);
    }

    void exibirSaldo(int numero) {
        ContaBancaria conta = buscarConta(numero);
        if (conta == null) {
            System.out.println("Conta " + numero + " não encontrada!");
            return;
        }
        conta.exibirSaldo();
    }

    void exibirExtrato(int numero) {
        ContaBancaria conta = buscarConta(numero);
        if (conta == null) {
            System.out.println("Conta " + numero + " não encontrada!");
            return;
        }
        conta.exibirExtrato();
    }

    void aplicarRendimento(int numero, double percentual) {
        ContaBancaria conta = buscarConta(numero);
        if (conta == null) {
            System.out.println("Conta " + numero + " não encontrada!");
            return;
        }
        if (!(conta instanceof ContaPoupanca)) {
            System.out.println("Esta conta não possui rendimento!");
            return;
        }
        ContaPoupanca poupanca = (ContaPoupanca) conta;
        poupanca.aplicarRendimento(percentual);
    }

    void listarContas() {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }
        for (int i = 0; i < contas.size(); i++) {
            ContaBancaria conta = contas.get(i);
            String tipo = (conta instanceof ContaPoupanca) ? "Poupança" : "Corrente";
            System.out.println((i + 1) + " - " + conta.getTitular().getNome() + " - " + tipo + " - Saldo: " + conta.getSaldo());
        }
    }
}
