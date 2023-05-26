package Aula.Heranca;
public class Ponto {
    private double x;
    private double y;

    public Ponto() {
    }
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPonto(double x , double y){
        setX(x);
        setY(y);

    }


}