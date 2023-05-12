package Curso.Java.Udemy;

import java.util.Scanner;

public class mFuncaoLinear {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Favor digite o valores A e B: ");
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        FuncaoLinear funcaoLinear = new FuncaoLinear(a,b);
        System.out.println("Sua função "+funcaoLinear);
        System.out.println("Inclinação da reta: "+funcaoLinear.inclinacao());
        System.out.println("Raiz: "+funcaoLinear.raiz());

    }
}
