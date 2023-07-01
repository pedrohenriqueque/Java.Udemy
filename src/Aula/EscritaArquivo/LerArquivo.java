package Aula.EscritaArquivo;

import  java.io.FileReader;
import java.util.Scanner;
public class LerArquivo {
    public static void main(String[] args) {
        Scanner arquivo = null;
        try {
            FileReader in = new FileReader("nomes.txt");
            arquivo = new Scanner(in);
            for(int i = 0 ; i < 5 ; i++){
                System.out.println("Nome: " + arquivo.nextLine());
                System.out.println("Telefone: " +arquivo.nextLine());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            arquivo.close();
        }
    }
}
