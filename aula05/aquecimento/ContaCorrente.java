package aula05.aquecimento;

public class ContaCorrente extends ContaBancaria {

    private Double tarifaSaque = 0.5;

    ContaCorrente(Titular titular, Double saldoInicial) {
        super(titular, saldoInicial);
    }

    public Double getTarifaSaque() {
        return tarifaSaque;
    }

    @Override
    void sacar(double valor) {
        if (valor <= tarifaSaque) {
            System.out.println("Valor inválido! O valor do saque deve ser maior que a tarifa de saque.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        if (valor + tarifaSaque > saldo) {
            System.out.println("Saldo insuficiente para cobrir o valor do saque e a tarifa de saque!");
            return;
        }
        saldo -= valor + tarifaSaque;
        movimentacoes.add(-valor);

        System.out.println("Saque realizado com sucesso! Novo saldo: " + saldo);
    }
}
