package aula10.exercicio1.notificacao;

public class SmsNotificador implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[SMS] " + mensagem);
    }
}
