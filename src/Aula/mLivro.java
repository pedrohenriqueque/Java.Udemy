package Aula;

import java.util.ArrayList;
import java.util.Scanner;

public class mLivro {
    public static void main(String[] args) {


        ArrayList<Livro> livros = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String titulo, autor;
        int ano;
        double preco;

        do {
            System.out.println("Digite o Titulo do Livro: (ou vazio para parar)");
            titulo = teclado.nextLine();
            if (!titulo.isEmpty()) {
                System.out.println("Digite o nome do autor: ");
                autor = teclado.nextLine();
                System.out.println("Digite o ano de publicacao: ");
                ano = teclado.nextInt();
                System.out.println("Digite o preco do livro: ");
                preco = teclado.nextDouble();
                teclado.nextLine();
                livros.add(new Livro(titulo, autor, ano, preco));
            }
        } while (!titulo.isEmpty());
        System.out.println("Digite o titulo do livro  a ser encontrado: ");
        String busca = teclado.nextLine();
        Livro encontrar = Livro.buscarLivro(livros,busca);
        if(encontrar == null){
            System.out.println("O Livro não foi encontrado");
        }
        else{
            System.out.println(encontrar);
        }
    }
}
