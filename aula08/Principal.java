package aula08;

public class Principal {
    public static void main(String[]args) {

        CalculadoraDePreco calc = new CalculadoraDePreco();
        System.out.println("Comum: R$ " + calc.calcular());
        System.out.println("Prata: R$ " + calc.calcular());
        System.out.println("Ouro: R$ " + calc.calcular());

    }
}
