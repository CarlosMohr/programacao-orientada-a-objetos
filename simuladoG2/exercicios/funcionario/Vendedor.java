package simuladoG2.exercicios.funcionario;

public class Vendedor extends Funcionario{
    private double comissao;
    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }
    public double getComissao() {
        return comissao;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + comissao;
    }
}
