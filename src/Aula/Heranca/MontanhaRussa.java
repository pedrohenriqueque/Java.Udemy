package Aula.Heranca;
public class MontanhaRussa extends Atracao{
    protected double altura_minima;

    public void setAltura_minima(double altura_minima) {
        this.altura_minima = altura_minima;
    }

    public double getAltura_minima() {
        return altura_minima;
    }

    public MontanhaRussa(String nome , int capacidade , double preco, double altura_minima){
        super(nome, capacidade , preco);
        setAltura_minima(altura_minima);
    }

    public String exibir_informacoes(){
        return "Montanha Russa: "
                +getNome()
                +"\nA Capacidade é de "
                +getCapacidade()
                +"\nO Preço de ingresso é "
                +getPreco()
                +"\nA Altura minima é de "
                +getAltura_minima();
    }
}
