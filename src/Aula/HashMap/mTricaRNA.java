package Aula.HashMap;


import java.util.Scanner;

public class mTricaRNA {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma String para Tradução: ");
        String traduzir = teclado.nextLine();

        traducaoRNA rna = new traducaoRNA();
        rna.traduzir(traduzir);
        System.out.println(rna);
    }
}
