package Aula.Interfaces;

public class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        setNome(nome);
        setPreco(preco);
        setQuantidadeEmEstoque(quantidadeEstoque);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setPreco(double preco) {
        if(preco > 0)
            this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if(quantidadeEmEstoque > 0)
            this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEstoque;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        if (this.preco < outroProduto.preco) {
            return -1;
        } else if (this.preco > outroProduto.preco) {
            return 1;
        } else {
            return 0;
        }
    }
}