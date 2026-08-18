package aula02.Exercicio1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        System.out.println("Digite o nome do aluno: ");
        aluno1.nome = leitor.nextLine();

        System.out.println("Digite a idade do aluno: ");
        aluno1.idade = leitor.nextInt();
        leitor.nextLine(); 
        aluno1.curso = "SISTEMAS DE INFORMAÇÃO";

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Zé";
        aluno2.idade = 19;
        aluno2.curso = "SISTEMAS DE INFORMAÇÃO";

        aluno1.apresentarDados();
        System.out.println();
        aluno2.apresentarDados();


        leitor.close();
    }
}