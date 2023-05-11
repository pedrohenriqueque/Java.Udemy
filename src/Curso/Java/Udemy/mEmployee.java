package Curso.Java.Udemy;

import java.util.Scanner;

public class mEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Name: ");
        employee.name = teclado.nextLine();
        System.out.println("Gross Salary: ");
        employee.grossSalary = teclado.nextDouble();
        System.out.println("Tax: ");
        employee.tax = teclado.nextDouble();

        System.out.println(employee);
        System.out.println("Which percentage to increase salary? ");
        double percentage = teclado.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println(employee);

    }
}
