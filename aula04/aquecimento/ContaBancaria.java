package aula04.aquecimento;

public class ContaBancaria {
    
    private Titular titular;
    private Double saldo;
    int operacoes = 0;
    Double tarifaSaque = 0.5;
    Double percentualRendimento;

    public double getSaldo() { //getter: leitura
        return saldo;
    }

    public void setTitular(Titular novo) { //setter: alteração
        if (novo == null) {
            System.out.println("titular inválido");
        }
        else {
            titular = novo;
        }
    }



    ContaBancaria(Titular titular, Double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido! O valor do depósito deve ser maior que zero.");
            return;
        }
        saldo += valor;
        System.out.println("Depósito realizado com sucesso! Novo saldo: " + saldo);
        operacoes++;
    }

    void sacar(double valor) {
        if (valor <= tarifaSaque) {
            System.out.println("Valor inválido! O valor do saque deve ser maior que a tarifa de saque.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        if (valor + tarifaSaque > saldo) { /// verifica se o saldo é suficiente para cobrir o valor do saque e a tarifa de saque
            System.out.println("Saldo insuficiente para cobrir o valor do saque e a tarifa de saque!");
            return;
        }
        saldo -= valor + tarifaSaque;

        System.out.println("Saque realizado com sucesso! Novo saldo: " + saldo);
        operacoes++;
    }
    void exibirSaldo() {
        System.out.println("Titular: " + titular.nome + "\nSaldo: " + saldo);
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
        operacoes++;
    }


    void aplicarRendimento(double percentual) {
        if (percentual <= 0 || percentual > 100) {
            System.out.println("Percentual inválido! O percentual de rendimento deve ser maior que zero e menor ou igual a 100.");
            return;
        }
        else {
            saldo += saldo * percentual / 100;
            System.out.println("Rendimento aplicado com sucesso! Novo saldo: " + saldo);

        }
    }
}
