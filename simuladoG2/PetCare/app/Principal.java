package simuladoG2.PetCare.app;

import java.time.LocalDate;

import simuladoG2.PetCare.atendimento.AgendaDoDia;
import simuladoG2.PetCare.atendimento.Atendimento;
import simuladoG2.PetCare.pet.Pet;
import simuladoG2.PetCare.relatorio.Relatorio;
import simuladoG2.PetCare.relatorio.RelatorioConsole;
import simuladoG2.PetCare.servico.BanhoTosa;
import simuladoG2.PetCare.servico.Consulta;
import simuladoG2.PetCare.servico.Hospedagem;
import simuladoG2.PetCare.servico.Servico;
import simuladoG2.PetCare.servico.Vacina;
import simuladoG2.PetCare.tutor.Tutor;

public class Principal {
    public static void main(String[] args) {
        // [SINGLETON] pega a agenda única (new AgendaDoDia() daria erro)
        AgendaDoDia agenda = AgendaDoDia.getInstancia();

        Tutor marina = new Tutor("Marina", "(55) 98888-1111");
        Tutor joao = new Tutor("João", "(55) 98888-2222");

        Pet thor = new Pet("Thor", "Cachorro", marina);
        Pet mia = new Pet("Mia", "Gato", joao);

        // [POLIMORFISMO] variável do tipo Servico guardando cada subclasse
        Servico consulta = new Consulta("Consulta geral", 120.0, 30);
        Servico vacina = new Vacina("Vacina V10", 40.0, 10, 80.0);
        Servico banho = new BanhoTosa("Banho e tosa", 70.0, 60);
        Servico hospedagem = new Hospedagem("Hospedagem", 90.0, 15, 3);

        Atendimento atendimento1 = new Atendimento(thor, LocalDate.now());
        atendimento1.adicionarServico(consulta);
        atendimento1.adicionarServico(vacina);
        atendimento1.adicionarServico(banho);

        Atendimento atendimento2 = new Atendimento(mia, LocalDate.now());
        atendimento2.adicionarServico(hospedagem);
        atendimento2.adicionarServico(consulta);

        agenda.adicionarAtendimento(atendimento1);
        agenda.adicionarAtendimento(atendimento2);

        // [DIP] variável do tipo da interface; trocar o relatório muda só esta linha
        Relatorio relatorio = new RelatorioConsole();
        relatorio.gerarRelatorio(agenda);
    }
}

/*
 * PERGUNTA: serviço Microchip (preço base + R$ 30,00 do chip)
 *
 * Crio só um arquivo novo: Microchip.java, que faz "extends Servico" e no
 * CalcularPreco() devolve getPrecoBase() + 30. Nenhuma classe existente
 * precisa mudar, só o Principal, para criar e usar o microchip.
 * Isso é o O do SOLID (Aberto/Fechado): aberto para extensão, fechado
 * para modificação.
 */
