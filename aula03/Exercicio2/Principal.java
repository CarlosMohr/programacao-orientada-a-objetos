package aula03.Exercicio2;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("João", 999999999);
        Paciente paciente2 = new Paciente("Maria", 988888888);

        Consulta consulta1 = new Consulta(paciente1, LocalDate.of(2026, 8, 20), 250.0);
        Consulta consulta2 = new Consulta(paciente2, LocalDate.of(2026, 8, 21), 300.0);

        consulta1.exibirComprovante();
        consulta2.exibirComprovante();

        consulta1.remarcar(LocalDate.of(2026, 8, 25));
        consulta1.exibirComprovante();
    }
}
