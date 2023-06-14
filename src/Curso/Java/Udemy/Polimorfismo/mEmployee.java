package Curso.Java.Udemy.Polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

public class mEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> empregados = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Enter the number of employees:  ");
        int qtdEmployers = teclado.nextInt();

        for(int i = 1 ; i <= qtdEmployers ; i++){
            System.out.println("Employee #"+i +" data: ");
            System.out.println("Outsourced (y/n)? ");
            char opcao = teclado.next().charAt(0);
            System.out.println("Name: ");
            teclado.nextLine();
            String name = teclado.nextLine();
            System.out.println("Hours: ");
            int hours = teclado.nextInt();
            System.out.println("Value per hour: ");
            double valuePerHour = teclado.nextDouble();
            if(opcao == 'y'){
                System.out.println("Additional charge: ");
                double additionalCharge = teclado.nextDouble();
                empregados.add(new OutSourcedEmployee(name,hours,valuePerHour,additionalCharge));
            }else {
                empregados.add(new Employee(name, hours, valuePerHour));
            }
            }
        for(Employee a : empregados){
            System.out.println(a.getName() + " - $ " + a.payment());
        }
    }
}
