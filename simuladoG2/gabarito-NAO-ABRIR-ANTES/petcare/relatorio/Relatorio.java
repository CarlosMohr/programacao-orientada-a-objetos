package petcare.relatorio;

import petcare.atendimento.AgendaDoDia;

// [ABSTRAÇÃO + DIP + OCP] o main depende desta interface; outro formato = outra classe
public interface Relatorio {
    void gerarRelatorio(AgendaDoDia agenda);
}
