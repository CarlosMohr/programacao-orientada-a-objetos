package aula05.aquecimento;

public class ContaPoupanca extends ContaBancaria {

    ContaPoupanca(Titular titular, Double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido! O valor do saque deve ser maior que zero.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo -= valor;
        movimentacoes.add(-valor);

        System.out.println("Saque realizado com sucesso! Novo saldo: " + saldo);
    }

    void aplicarRendimento(double percentual) {
        if (percentual <= 0 || percentual > 100) {
            System.out.println("Percentual inválido! O percentual de rendimento deve ser maior que zero e menor ou igual a 100.");
            return;
        } else {
            saldo += saldo * percentual / 100;
            System.out.println("Rendimento aplicado com sucesso! Novo saldo: " + saldo);
        }
    }
}
