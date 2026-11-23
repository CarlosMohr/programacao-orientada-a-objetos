package simuladoG2.PetCare.relatorio;

import simuladoG2.PetCare.atendimento.AgendaDoDia;

// [ABSTRAÇÃO + DIP] o Principal depende desta interface, não de "como" o relatório é mostrado
// [OCP] relatório em arquivo = nova classe que implementa Relatorio, sem mexer no resto
public interface Relatorio {
    void gerarRelatorio(AgendaDoDia agenda);
}
