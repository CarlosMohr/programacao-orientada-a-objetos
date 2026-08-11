package Exercicio3;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.titulo = "O Poderoso Chefão";
        filme1.duracao = 175;
        filme1.nota = 9.2;
        filme1.assistido = true;

        Filme filme2 = new Filme();
        filme2.titulo = "Toy Story";
        filme2.duracao = 81;
        filme2.nota = 8.6;
        filme2.assistido = false;

        Filme filme3 = new Filme();
        filme3.titulo = "Carros";
        filme3.duracao = 117;
        filme3.nota = 7.9;
        filme3.assistido = false;

        filme1.avaliar(10.0);
        filme2.marcarAssistido();
        filme1.exibirDados();
        filme2.exibirDados();
        filme3.exibirDados();
    }
}
