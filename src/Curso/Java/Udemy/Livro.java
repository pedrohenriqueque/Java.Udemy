package Curso.Java.Udemy;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private double preco;

    public Livro(String titulo , String autor , int ano , double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.preco = preco;
    }
    public String getTitulo(){
        return titulo;
    }

    public String toString(){
        return "Livro"
                +titulo
                +autor
                +ano
                +String.format("%.2f",preco);
    }
}
