package Curso.Java.Udemy;

import java.util.Scanner;

public class mRent {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Rent [] vet = new Rent[10];
        System.out.println("How many rooms will be rented? ");
        int option = teclado.nextInt();

        for(int i = 0 ; i < option ; i++){
            System.out.println("Rent # "+i + ":");
             teclado.nextLine();
            System.out.println("Name:");
            String name = teclado.nextLine();
            System.out.println("Email: ");
            String email = teclado.nextLine();
            System.out.println("Room: ");
            int room = teclado.nextInt();
            vet[room] = new Rent(name,email);
        }
        for(int i = 0 ; i < 10 ; i ++){
            if(vet[i] != null){
                System.out.println(i+": "+vet[i]);
            }
        }



    }
}
