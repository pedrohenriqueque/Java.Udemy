package Curso.Java.Udemy;
import java.util.Scanner;

    public class mProduct {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            Product product = new Product();
            System.out.println("Enter Product Data: ");
            System.out.println("Name: ");
            product.name = teclado.nextLine();
            System.out.println("Price: ");
            product.price = teclado.nextDouble();
            System.out.println("Quantity in stock: ");
            product.quantity = teclado.nextInt();

            System.out.println("\n Product data: "+product);

            System.out.print("Enter the number of product to be added in stock:");
            int quantity = teclado.nextInt();
            product.addProducts(quantity);
            System.out.println("\n Updated data: "+product);
            System.out.print("Enter the number of product to be removed from stock: ");
            quantity = teclado.nextInt();
            product.removeProduct(quantity);
            System.out.println("\n Updated data: "+product);
        }
    }
