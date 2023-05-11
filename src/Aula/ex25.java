package Aula;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int r = teclado.nextInt();
        int[] v;
        v = new int[r];

        for(int i = 0 ; i < r ; i ++)
            v[i] = teclado.nextInt();

        int k = teclado.nextInt();
        int p = teclado.nextInt();

        if (p < 0 || p > r) {
            System.out.println("Posicao invalida");
            return;
        }

        for (int i = r-1; i > p; i--)
            v[i] = v[i-1];

        v[p] = k;

        for(int n : v){
            System.out.println(n);
        }
    }
}
