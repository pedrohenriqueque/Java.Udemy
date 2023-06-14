package Aula.Interfaces;

public class Livro implements ItemVendavel{
    private String titulo;
    private double preco;
    private int qtdEstoque;
    private String autor;
    private int qtdPaginas;

    public Livro(String titulo, double preco, int qtdEstoque, String autor, int qtdPaginas){
        setTitulo(titulo);
        setPreco(preco);
        setQtdEstoque(qtdEstoque);
        setAutor(autor);
        setQtdPaginas(qtdPaginas);
    }
    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(double preco) {
        if(preco > 0)
            this.preco = preco;
    }

    @Override
    public void setQtdEstoque(int qtdEstoque) {
        if(qtdEstoque > 0)
            this.qtdEstoque = qtdEstoque;
    }

    @Override
    public int getQtdEstoque() {
        return qtdEstoque;
    }

    @Override
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public void setQtdPaginas(int qtdPaginas) {
        if(qtdPaginas > 0)
            this.qtdPaginas = qtdPaginas;
    }

    @Override
    public int getQtdPaginas() {
        return qtdPaginas;
    }

    @Override
    public void vender(int quantidade) {
        if(qtdEstoque >= quantidade)
                qtdEstoque = qtdEstoque - quantidade;
        else
            System.out.println("Quantidade Superior ao Estoque");
    }

    @Override
    public void adicionarEstoque(int quantidade) {
        if(quantidade > 0)
            qtdEstoque += quantidade;
        else
            System.out.println("Quantidade Invalida");
    }
}
