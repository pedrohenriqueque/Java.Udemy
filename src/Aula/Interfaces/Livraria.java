package Aula.Interfaces;

import java.util.ArrayList;

public class Livraria {
    private ArrayList<Livro> estoque;

    public Livraria(){
        this.estoque = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        estoque.add(livro);
    }

    public void venderLivro(Livro livro , int quantidade){
        livro.vender(quantidade);
    }
    public void adicionarEstoqueLivro(Livro livro, int quantidade){
        livro.adicionarEstoque(quantidade);
    }

    public void exibir(){
        for (Livro l : estoque) {
            System.out.println("Título: " + l.getTitulo());
            System.out.println("Preço: " + l.getPreco());
            System.out.println("Quantidade em estoque: " + l.getQtdEstoque());
            System.out.println("Autor: " + l.getAutor());
            System.out.println("Paginas: " + l.getQtdPaginas());
            System.out.println("-----------------------------");
        }
    }
}

