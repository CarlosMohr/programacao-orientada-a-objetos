package simuladoG2.PetCare.relatorio;

import simuladoG2.PetCare.atendimento.AgendaDoDia;
import simuladoG2.PetCare.atendimento.Atendimento;
import simuladoG2.PetCare.servico.Servico;

// [SRP] só imprime; as contas ficam em Atendimento e AgendaDoDia
public class RelatorioConsole implements Relatorio {

    @Override
    public void gerarRelatorio(AgendaDoDia agenda) {
        for (Atendimento atendimento : agenda.getAtendimentos()) {
            System.out.println("Pet: " + atendimento.getPet().getNome()
                    + " - Tutor: " + atendimento.getPet().getTutor().getNome());

            for (Servico servico : atendimento.getServicos()) {
                System.out.println(servico.getNome() + " - R$ " + servico.CalcularPreco());
            }

            System.out.println("Total: R$ " + atendimento.calcularTotal());
            System.out.println("Duração: " + atendimento.duracaoTotal() + " min");
        }

        System.out.println("Faturamento do dia: R$ " + agenda.calcularFaturamento());
    }
}
