package Aula;

import java.util.Scanner;

public class ex24 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        int[] v;
        v = new int[n];

        for (int i = 0; i < n; i++)
            v[i] = teclado.nextInt();

        int k = teclado.nextInt();
        int contador = 0;
        for (int i = 0 ; i < n ;i++) {
            if (v[i] == k) {
                System.out.printf("Aparece na Posição %d\n",i);
                contador++;
            }
        }
        if (contador == 0)
            System.out.println("Numero não Encontrado");

    }
}