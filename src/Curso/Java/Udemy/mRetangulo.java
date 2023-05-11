package Curso.Java.Udemy;
import java.util.Scanner;

public class mRetangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        System.out.print("Enter rectangle width and height: ");
        retangulo.height = teclado.nextInt();
        retangulo.width = teclado.nextInt();

        System.out.println();
        System.out.println();
        System.out.println(retangulo);

    }
}
