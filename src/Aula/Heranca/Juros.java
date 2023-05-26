package Aula.Heranca;
public class Juros {

    protected double juros;
    protected double capital;
    protected double taxa;
    protected int tempo;

    public void setJuros(double juros){
        this.juros = juros;
    }
    public double getJuros(){
        return this.juros;
    }
    public void setCapital(double capital){
        if(capital > 0)
            this.capital = capital;
    }
    public double getCapital(){
        return this.capital;
    }
    public void setTaxa(double taxa){
        if(taxa >= 0.0 && taxa <= 1.0)
            this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getTempo() {
        return tempo;
    }

    public Juros( double capital, double taxa, int tempo){
        setCapital(capital);
        setTaxa(taxa);
        setTempo(tempo);
    }
}
