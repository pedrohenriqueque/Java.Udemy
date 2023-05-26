package Aula.Heranca;
public class JurosCompostos extends Juros{
    public JurosCompostos( double capital , double taxa , int tempo) {
        super( capital, taxa, tempo);
    }

    public void calcularJuros(){
        double juros;
        juros = getCapital() * Math.pow(( 1  + getTaxa() ) , getTempo()) - getCapital();
        setJuros(juros);
    }
}
