package Curso.Java.Udemy.Polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

public class mProduct {
    public static void main(String[] args) {
        ArrayList<Product> produtos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Enter the number of products: ");
        int qtdProducts = teclado.nextInt();
        for(int i = 1 ; i <= qtdProducts; i++){
            System.out.println("Product #"+i +" data: ");
            System.out.println("Common, used or imported (c/u/i)? ");
            char opcao = teclado.next().charAt(0);
            System.out.println("Name: ");
            teclado.nextLine();
            String name = teclado.nextLine();
            System.out.println("Price: ");
            double price = teclado.nextDouble();
            if(opcao == 'i'){
                System.out.println("Customs fee: ");
                double customFee = teclado.nextDouble();
                produtos.add(new ImportedProduct(name,price,customFee));
            }else if(opcao == 'u'){
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                teclado.nextLine();
                String manufactureDate = teclado.nextLine();
                produtos.add(new UsedProduct(name,price,manufactureDate));
            }
            else{
                produtos.add(new Product(name,price));
            }
        }
        System.out.println("Price Tags: ");
        for(Product a : produtos){
            System.out.println(a.priceTag());
        }
    }
}
