package Curso.Java.Udemy;


import java.util.Scanner;

public class mCurrencyConverter {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o Preço do Dolar: ");
        double preco = teclado.nextDouble();
        System.out.println("Digite a Quantidade de Dolares");
        double quantidade = teclado.nextDouble();
        System.out.println(CurrencyConverter.convertDollars(preco, quantidade));

    }
}
