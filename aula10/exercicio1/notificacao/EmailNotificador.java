package aula10.exercicio1.notificacao;

public class EmailNotificador implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[E-MAIL] " + mensagem);
    }
}
