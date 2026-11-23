package simuladoG2.PetCare.atendimento;
import simuladoG2.PetCare.servico.Agendavel;
import simuladoG2.PetCare.servico.Cobravel;
import simuladoG2.PetCare.servico.Servico;
import simuladoG2.PetCare.pet.Pet;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

// [SRP] guarda os serviços de um pet e faz as contas do atendimento (não imprime nada)
// [DIP] depende de Servico (abstrato), nunca de Consulta/Vacina/...
public class Atendimento {
    private Pet pet;
    private LocalDate data;
    private List<Servico> servicos = new ArrayList<>();


    public Atendimento(Pet pet, LocalDate data){
        this.pet = pet;
        this.data = data;
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    // [POLIMORFISMO] cada serviço calcula o próprio preço
    // [ISP] aqui só precisa do preço, então enxerga o serviço como Cobravel
    public double calcularTotal() {
        double total = 0;
        for (Cobravel servico : servicos) {
            total += servico.CalcularPreco();
        }
        return total;
    }

    // [ISP] aqui só precisa da duração, então enxerga o serviço como Agendavel
    public int duracaoTotal() {
        int total = 0;
        for (Agendavel servico : servicos) {
            total += servico.getDuracao();
        }
        return total;
    }

    public List<Servico> getServicos() {
        return servicos;
    }
    public Pet getPet(){
        return pet;
    }
    public LocalDate getData(){
        return data;
    }
}