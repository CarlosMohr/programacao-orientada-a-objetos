package petcare.relatorio;

import petcare.atendimento.AgendaDoDia;
import petcare.atendimento.Atendimento;
import petcare.servico.Servico;

// [SRP] só imprime; as contas ficam em Atendimento e AgendaDoDia
public class RelatorioConsole implements Relatorio {

    @Override
    public void gerarRelatorio(AgendaDoDia agenda) {
        for (Atendimento atendimento : agenda.getAtendimentos()) {
            System.out.println("Animal: " + atendimento.getAnimal().getNome()
                    + " (tutor: " + atendimento.getAnimal().getTutor().getNome() + ")");

            for (Servico servico : atendimento.getServicos()) {
                System.out.println(servico.getNome() + " - R$ " + servico.calcularValor());
            }

            System.out.println("Total: R$ " + atendimento.calcularTotal());
            System.out.println("Duração: " + atendimento.calcularDuracao() + " min");
        }

        System.out.println("Faturamento do dia: R$ " + agenda.calcularFaturamento());
    }
}
