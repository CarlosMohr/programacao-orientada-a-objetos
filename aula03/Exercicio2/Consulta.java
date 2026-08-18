package aula03.Exercicio2;

import java.time.LocalDate;

public class Consulta {
    Paciente paciente;
    LocalDate data;
    Double valor;

    Consulta(Paciente paciente, LocalDate data, Double valor) {
        this.paciente = paciente;
        this.data = data;
        this.valor = valor;
    }

    void exibirComprovante() {
        System.out.println("===== COMPROVANTE DE CONSULTA =====");
        System.out.println("Paciente: " + paciente.nome);
        System.out.println("Telefone: " + paciente.telefone);
        System.out.println("Data: " + data);
        System.out.println("Valor: R$" + valor);
        System.out.println("====================================");
    }

    void remarcar(LocalDate novaData) {
        LocalDate dataAnterior = this.data;
        this.data = novaData;
        System.out.println("Consulta remarcada de " + dataAnterior + " para " + novaData);
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "paciente=" + paciente.nome +
                ", data=" + data +
                ", valor=" + valor +
                '}';
    }
}
