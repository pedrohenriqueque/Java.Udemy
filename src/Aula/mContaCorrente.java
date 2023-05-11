package Aula;

import java.util.Scanner;

public class mContaCorrente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        ContaCorrente Maria = new ContaCorrente(0);
        Maria.mostrarSaldo();
        while (opcao != 4) {
            System.out.println(" 1 - Depositar");
            System.out.println(" 2 - Saque");
            System.out.println(" 3 - Mostrar Saldo");
            System.out.println(" 4 - Terminar");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o Valor que Deseja Depositar:");
                    double valorDeposito = teclado.nextDouble();
                    Maria.setMovimentacao(valorDeposito);
                    Maria.depositar();
                    Maria.mostrarMovimentacao();
                    break;
                case 2:
                    System.out.println("Digite o Valor que Deseja Sacar:");
                    double valorSaque = teclado.nextDouble();
                    Maria.setMovimentacao(valorSaque);
                    Maria.sacar();
                    Maria.mostrarMovimentacao();
                    break;
                case 3:
                    Maria.mostrarSaldo();
                    break;
                case 4:
                    System.out.println("Terminou.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}