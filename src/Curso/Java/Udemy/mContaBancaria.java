package Curso.Java.Udemy;
import java.util.Scanner;
public class mContaBancaria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ContaBancaria contabancaria;
        System.out.print("Enter account number: \n");
        int account = teclado.nextInt();
        System.out.print("Enter account holder: \n");
        teclado.nextLine();
        String holder = teclado.nextLine();
        System.out.print("Is there an inital deposit (y/n)? \n");
        char option = teclado.next().charAt(0);
        if(option == 'y'){
            System.out.println("Enter a initial deposit value");
            double inicial = teclado.nextDouble();
            contabancaria = new ContaBancaria(account, holder,inicial);
        }else {
             contabancaria = new ContaBancaria(account, holder);
        }
        System.out.println("Account data:");
        System.out.println(contabancaria);
        System.out.println("\n Enter a deposit value: ");
        double deposit = teclado.nextDouble();
        contabancaria.setDeposito(deposit);
        System.out.println("Updated account data: ");
        System.out.println(contabancaria);
        System.out.println("Enter a withdraw value: ");
        double withdraw = teclado.nextDouble();
        contabancaria.setSaque(withdraw);
        System.out.println("Updated account data: ");
        System.out.println(contabancaria);
    }
}
