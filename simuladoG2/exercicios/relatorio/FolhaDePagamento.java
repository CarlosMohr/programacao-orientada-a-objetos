package simuladoG2.exercicios.relatorio;
import java.util.List;
import java.util.ArrayList;
import simuladoG2.exercicios.funcionario.Funcionario;

public class FolhaDePagamento {
    private List<Funcionario> funcionarios = new ArrayList<>();


    private static FolhaDePagamento instancia;
        private FolhaDePagamento() {
        }

        public static FolhaDePagamento getInstancia() {
            if (instancia == null) {
                instancia = new FolhaDePagamento();
            }
            
            return instancia;
        }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        }
    
    public double calcularTotal() {
        double total = 0;
        for  (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }
        return total;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
