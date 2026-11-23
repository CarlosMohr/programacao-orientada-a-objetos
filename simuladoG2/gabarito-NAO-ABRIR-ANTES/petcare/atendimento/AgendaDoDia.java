package petcare.atendimento;

import java.util.ArrayList;
import java.util.List;

// [SINGLETON] uma única agenda do dia
// [SRP] só guarda os atendimentos e soma o faturamento
public class AgendaDoDia {
    private static AgendaDoDia instancia;

    private List<Atendimento> atendimentos = new ArrayList<>();

    private AgendaDoDia() {
    }

    public static AgendaDoDia getInstancia() {
        if (instancia == null) {
            instancia = new AgendaDoDia();
        }
        return instancia;
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    public double calcularFaturamento() {
        double total = 0;
        for (Atendimento atendimento : atendimentos) {
            total += atendimento.calcularTotal();
        }
        return total;
    }

    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }
}
