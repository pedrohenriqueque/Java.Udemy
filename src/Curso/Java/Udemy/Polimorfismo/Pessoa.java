package Curso.Java.Udemy.Polimorfismo;

public abstract class Pessoa {
    private String nome;
    private double renda;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setRenda(double renda) {
        if(renda > 0)
            this.renda = renda;
    }
    public double getRenda() {
        return renda;
    }
    public Pessoa(String nome, double renda){
        setNome(nome);
        setRenda(renda);
    }

    public abstract double calcularImposto();


}
