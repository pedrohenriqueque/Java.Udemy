package Aula.Heranca;
public class Carrossel extends Atracao {
    protected int idade_minima;

    public int getIdade_minima() {
        return idade_minima;
    }

    public void setIdade_minima(int idade_minima) {
        if(idade_minima > 0)
            this.idade_minima = idade_minima;
    }

    public Carrossel(String nome, int capacidade, double preco, int idade_minima) {
        super(nome, capacidade, preco);
        setIdade_minima(idade_minima);
    }
    public String exibir_informacoes(){
        return "Carrosel: "
                +getNome()
                +"\nA Capacidade é de : "
                +getCapacidade()
                +"\nO Preço de Ingresso é : "
                +getPreco()
                 +"\nA Idade Minima permitida é de : "
                +getIdade_minima();
    }
}
