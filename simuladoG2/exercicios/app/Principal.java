package simuladoG2.exercicios.app;
import simuladoG2.exercicios.produto.Produto;
import simuladoG2.exercicios.relatorio.FolhaDePagamento;
import simuladoG2.exercicios.funcionario.*;

public class Principal {
    public static void main(String [] args) {

        Produto produto1 = new Produto("Café", 29.90);
        System.out.println(produto1.getNome() + "    R$" + produto1.getPreco());
        Produto produto2 = new Produto("Leite", 6);
        System.out.println(produto2.getNome() + "    R$" + produto2.getPreco());

        Funcionario funcionario1 = new Estagiario("João", 1000);
        System.out.println(funcionario1.getNome() + ": R$" + funcionario1.calcularSalario());

        Funcionario funcionario2 = new Gerente("Mário", 1000);
        System.out.println(funcionario2.getNome() + ": R$" + funcionario2.calcularSalario());

        Funcionario funcionario3 = new Vendedor("Ana", 1000, 500);
        System.out.println(funcionario3.getNome() + ": R$" + funcionario3.calcularSalario());


        FolhaDePagamento folhaDePagamento = FolhaDePagamento.getInstancia();

        folhaDePagamento.adicionarFuncionario(funcionario1);
        folhaDePagamento.adicionarFuncionario(funcionario2);
        folhaDePagamento.adicionarFuncionario(funcionario3);

        System.out.println(folhaDePagamento.calcularTotal());





    }



}