package aula10.exercicio1.pedido;

import aula10.exercicio1.notificacao.Notificador;

public class ConfirmacaoPedido {
    private Notificador notificador;

    public ConfirmacaoPedido(Notificador notificador) {
        this.notificador = notificador;
    }

    public void confirmar(int numeroPedido) {
        notificador.enviar("Pedido " + numeroPedido + " confirmado!");
    }
}
