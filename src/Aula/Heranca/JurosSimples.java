package Aula.Heranca;
public class JurosSimples extends Juros{

    public JurosSimples(double capital , double taxa , int tempo){
        super( capital , taxa , tempo);
    }

    public void calcularJuros(){
        double juros;
        juros = getCapital() * getTaxa() * getTempo();
        setJuros(juros);
    }
}
