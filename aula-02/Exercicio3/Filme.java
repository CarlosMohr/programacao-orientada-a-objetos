package Exercicio3;

public class Filme {
    String titulo;
    int duracao;
    Double nota;
    Boolean assistido;


    void exibirDados() {
        System.out.println("Filme: " + titulo + "\nDuração: " + duracao + " minutos" + "\nNota: " + nota + "\nAssistido: " + assistido);
    }

    void marcarAssistido() {
        if (assistido == false) {
            assistido = true;
            System.out.println(titulo + "Filme marcado como assistido!");
        } else {
            System.out.println(titulo + "Filme já foi assistido!");
        }
    }

    void avaliar(double novaNota) {
        if (novaNota < 0 || novaNota > 10) {
            System.out.println(titulo + "Nota inválida! A nota deve estar entre 0 e 10.");
            return;
        }
        nota = novaNota;
        System.out.println(titulo + "Filme avaliado com sucesso! Nova nota: " + nota);
    }
}

