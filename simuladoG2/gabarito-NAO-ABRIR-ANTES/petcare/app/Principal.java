package petcare.app;

import java.time.LocalDate;

import petcare.atendimento.AgendaDoDia;
import petcare.atendimento.Atendimento;
import petcare.modelo.Animal;
import petcare.modelo.Tutor;
import petcare.relatorio.Relatorio;
import petcare.relatorio.RelatorioConsole;
import petcare.servico.BanhoTosa;
import petcare.servico.Consulta;
import petcare.servico.Hospedagem;
import petcare.servico.Servico;
import petcare.servico.Vacina;

public class Principal {
    public static void main(String[] args) {
        AgendaDoDia agenda = AgendaDoDia.getInstancia();

        Tutor marina = new Tutor("Marina", "(55) 98888-1111");
        Tutor joao = new Tutor("João", "(55) 98888-2222");

        Animal thor = new Animal("Thor", "Cachorro", marina);
        Animal mia = new Animal("Mia", "Gato", joao);

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

        // [DIP] variável do tipo da interface
        Relatorio relatorio = new RelatorioConsole();
        relatorio.gerarRelatorio(agenda);
    }
}

/*
 * RESPOSTA DA PERGUNTA FINAL:
 * Para o Microchip, crio só o arquivo novo Microchip.java (extends Servico,
 * calcularValor() = getPrecoBase() + 30). Nenhuma classe existente muda,
 * só o Principal, para criar e usar o microchip. Isso é o O do SOLID
 * (aberto para extensão, fechado para modificação).
 */
