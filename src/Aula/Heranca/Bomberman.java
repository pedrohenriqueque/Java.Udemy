package Aula.Heranca;
public class Bomberman {
    private int vida = 10;
    private int velocidade = 5;
    private String cor = "branco";
    protected Ponto ponto = new Ponto();
    public void setVida(int vida){
        this.vida = vida;
    }
    public int getVida(){
        return this.vida;
    }
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    public int getVelocidade(){
        return this.velocidade;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }
    public Bomberman(int vida, int velocidade, String cor,
                     double x, double y)
    {
        setVida(vida);
        setVelocidade(velocidade);
        setCor(cor);
        ponto.setPonto(x, y);
    }
    public String colocarBomba()
    {
        return "Colocando bomba na posição " + this.ponto.getX() +
                ", " + this.ponto.getY();
    }

}
