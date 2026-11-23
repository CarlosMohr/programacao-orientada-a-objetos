package petcare.atendimento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import petcare.modelo.Animal;
import petcare.servico.Agendavel;
import petcare.servico.Cobravel;
import petcare.servico.Servico;

// [SRP] guarda os serviços de um animal e faz as contas do atendimento
// [DIP] depende de Servico (abstrato), nunca de Consulta/Vacina/...
public class Atendimento {
    private Animal animal;
    private LocalDate data;
    private List<Servico> servicos = new ArrayList<>(); // mantém a ordem de solicitação

    public Atendimento(Animal animal, LocalDate data) {
        this.animal = animal;
        this.data = data;
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    // [POLIMORFISMO + ISP] só precisa do valor, então usa Cobravel
    public double calcularTotal() {
        double total = 0;
        for (Cobravel item : servicos) {
            total += item.calcularValor();
        }
        return total;
    }

    // [ISP] só precisa da duração, então usa Agendavel
    public int calcularDuracao() {
        int minutos = 0;
        for (Agendavel item : servicos) {
            minutos += item.getDuracao();
        }
        return minutos;
    }

    public Animal getAnimal() {
        return animal;
    }

    public LocalDate getData() {
        return data;
    }

    public List<Servico> getServicos() {
        return servicos;
    }
}
