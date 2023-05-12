package Curso.Java.Udemy;

import java.util.Scanner;

public class mLivro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite Quantos Livros: ");
        int qtd = teclado.nextInt();
        Livro [ ] vet = new Livro[qtd];
        for(int i = 0 ; i < qtd ; i++){
            teclado.nextLine();
            System.out.println("Titulo: ");
            String titulo = teclado.nextLine();
            System.out.println("Autor:");
            String autor = teclado.nextLine();
            System.out.println("Ano: ");
            int ano = teclado.nextInt();
            System.out.println("Preco: ");
            double preco = teclado.nextDouble();
            vet[i] = new Livro(titulo,autor,ano,preco);
        }
        System.out.println("Quer buscar um Livro y/n? ");
        char c = teclado.next().charAt(0);
            teclado.nextLine();
        if(c == 'y'){
            System.out.println("Digite o titlo do livro p/ buscar");
            String busca = teclado.nextLine();
            boolean encontrou = false;
            for(int i = 0 ; i < qtd ; i++){
                if(vet[i].getTitulo().equals(busca)) {
                    encontrou = true;
                    System.out.println(vet[i]);
                }

            }
            if(!encontrou){
                System.out.println("n encontrou");
            }
        }
    }
}
