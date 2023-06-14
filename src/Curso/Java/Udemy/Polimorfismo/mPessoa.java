package Curso.Java.Udemy.Polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

public class mPessoa {
    public static void main(String[] args) {
        ArrayList<Pessoa> pagadores = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Enter the number of tax payers: ");
        int qtdPayers = teclado.nextInt();
        for(int i = 1 ; i <= qtdPayers ; i++){
            System.out.println("Tax Payer #"+i +" data: ");
            System.out.println("Individual or Company (i/c)? ");
            char opcao = teclado.next().charAt(0);
            System.out.println("Name: ");
            teclado.nextLine();
            String name = teclado.nextLine();
            System.out.println("Anual income: ");
            double anualIncome = teclado.nextDouble();
            if(opcao == 'i'){
                System.out.println("Health expenditures: ");
                double gastos = teclado.nextDouble();
                pagadores.add(new PessoaFisica(name,anualIncome,gastos));
            }
            else{
                System.out.println("Number of employees: ");
                int qtdEmployees = teclado.nextInt();
                pagadores.add(new PessoaJuridica(name,anualIncome,qtdEmployees));
            }
        }
        double soma = 0;
        System.out.println("TAXES PAID: ");
        for(Pessoa a: pagadores){
            System.out.println(a.getNome() + ": & " + a.calcularImposto());
            soma += a.calcularImposto();
        }
        System.out.println("TOTAL TAXES: & " +soma);
    }
}
