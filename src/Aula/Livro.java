package Aula;
import java.util.ArrayList;
public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private double preco;

    public Livro(String titulo , String autor , int ano , double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.preco = preco;
    }
    public String toString() {
        return "Titulo: "
                + titulo
                + "\nAutor: "
                + autor
                + "\nAno: "
                + ano
                + "\nPreco: "
                + preco;
    }
    public String getTitulo(){
        return titulo;
    }


    public static Livro buscarLivro(ArrayList<Livro> livros ,String titulo){
        for(Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
        }
    }


