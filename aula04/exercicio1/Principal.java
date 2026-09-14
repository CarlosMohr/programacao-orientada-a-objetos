package aula04.exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Consultar saldo");
            System.out.println("6 - Ver extrato");
            System.out.println("7 - Aplicar rendimento");
            System.out.println("8 - Listar contas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("CPF: ");
                        String cpf = scanner.nextLine();
                        System.out.print("Data de nascimento: ");
                        String dataNasc = scanner.nextLine();
                        System.out.print("Saldo inicial: ");
                        double saldoInicial = scanner.nextDouble();
                        scanner.nextLine();
                        int numeroConta = banco.abrirConta(nome, cpf, dataNasc, saldoInicial);
                        System.out.println("Conta criada com sucesso! Número: " + numeroConta);
                        break;

                    case 2:
                        System.out.print("Número da conta: ");
                        int numeroSaque = scanner.nextInt();
                        System.out.print("Valor do saque: ");
                        double valorSaque = scanner.nextDouble();
                        scanner.nextLine();
                        banco.sacar(numeroSaque, valorSaque);
                        break;

                    case 3:
                        System.out.print("Número da conta: ");
                        int numeroDeposito = scanner.nextInt();
                        System.out.print("Valor do depósito: ");
                        double valorDeposito = scanner.nextDouble();
                        scanner.nextLine();
                        banco.depositar(numeroDeposito, valorDeposito);
                        break;

                    case 4:
                        System.out.print("Número da conta de origem: ");
                        int numeroOrigem = scanner.nextInt();
                        System.out.print("Número da conta de destino: ");
                        int numeroDestino = scanner.nextInt();
                        System.out.print("Valor da transferência: ");
                        double valorTransferencia = scanner.nextDouble();
                        scanner.nextLine();
                        banco.transferir(numeroOrigem, numeroDestino, valorTransferencia);
                        break;

                    case 5:
                        System.out.print("Número da conta: ");
                        int numeroSaldo = scanner.nextInt();
                        scanner.nextLine();
                        banco.exibirSaldo(numeroSaldo);
                        break;

                    case 6:
                        System.out.print("Número da conta: ");
                        int numeroExtrato = scanner.nextInt();
                        scanner.nextLine();
                        banco.exibirExtrato(numeroExtrato);
                        break;

                    case 7:
                        System.out.print("Número da conta: ");
                        int numeroRendimento = scanner.nextInt();
                        System.out.print("Percentual: ");
                        double percentual = scanner.nextDouble();
                        scanner.nextLine();
                        banco.aplicarRendimento(numeroRendimento, percentual);
                        break;

                    case 8:
                        banco.listarContas();
                        break;

                    case 0:
                        System.out.println("Encerrando...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
