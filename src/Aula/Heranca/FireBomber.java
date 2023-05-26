package Aula.Heranca;
public class FireBomber extends Bomberman
{
    public FireBomber(int vida, int velocidade,
                      String cor, double x, double y)
    {
        super(vida, velocidade, cor, x, y);
    }

    public String explodir()
    {
        return "Explosão na posição " +
                this.ponto.getX() + ", " + this.ponto.getY();
    }
}