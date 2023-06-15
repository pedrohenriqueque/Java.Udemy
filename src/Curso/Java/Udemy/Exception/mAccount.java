package Curso.Java.Udemy.Exception;

import java.util.Scanner;

public class mAccount {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Enter account data");
        System.out.println("Number: ");
        int number = teclado.nextInt();
        System.out.println("Holder: ");
        teclado.nextLine();
        String holder = teclado.nextLine();
        System.out.println("Initial balance: ");
        double balance = teclado.nextDouble();
        System.out.println("Withdraw limit: ");
        double limit = teclado.nextDouble();

        Account account = new Account(number,holder,balance,limit);
        System.out.println("Enter amount for withdraw: ");
        double amount = teclado.nextDouble();
        try {
            account.withdraw(amount);
            System.out.println("O Novo saldo é "+account.getBalance());
        }
        catch (BusinessException e){
            System.out.println(e.getMessage());
        }
    }
}
