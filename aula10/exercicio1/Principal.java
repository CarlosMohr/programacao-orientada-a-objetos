package aula10.exercicio1;

import aula10.exercicio1.notificacao.EmailNotificador;
import aula10.exercicio1.notificacao.SmsNotificador;
import aula10.exercicio1.pedido.ConfirmacaoPedido;

public class Principal {
    public static void main(String[] args) {
        ConfirmacaoPedido pedido1 = new ConfirmacaoPedido(new EmailNotificador());
        ConfirmacaoPedido pedido2 = new ConfirmacaoPedido(new SmsNotificador());

        pedido1.confirmar(1001);
        pedido2.confirmar(1002);
    }
}
