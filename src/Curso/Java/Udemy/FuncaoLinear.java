package Curso.Java.Udemy;

public class FuncaoLinear {
    private double a;
    private double b;

    public FuncaoLinear(double a , double b){


            this.a = a;
        this.b = b;
    }
    public double raiz(){
        return -b/a;
    }
    public String inclinacao(){
        if(a > 0)
            return "Crescente";
        else if(a < 0)
            return "Descrente";
        else
            return "Constante";
    }
    public String toString(){
        if (b<0) {
            return "f(x)="
                    + (int)a
                    + "x"
                    + ((int)b);
        } else if (b > 0) {
            return "f(x)="
                    + (int)a
                    + "x"
                    +"+"
                    + (int)b;
        }else{
            return "f(x)="
                    + (int)a
                    + "x";
    }
    }
}
