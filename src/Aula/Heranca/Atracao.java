package Aula.Heranca;
public class Atracao {
    protected String nome;
    protected int capacidade;
    protected double preco;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }
    public Atracao(String nome , int capacidade , double preco){
        setNome(nome);
        setCapacidade(capacidade);
        setPreco(preco);
    }

    public double arrecadacao_maxima(){
        return getPreco() * getCapacidade();
    }
}
