package Aula.HashMap;

import java.util.Scanner;

public class mConverterRomano {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um Numero para converte-lo para numeros romanos");
        int numero = teclado.nextInt();

        ConverterRomano converterRomano = new ConverterRomano();
        System.out.println(converterRomano.converter(numero));


    }
}
