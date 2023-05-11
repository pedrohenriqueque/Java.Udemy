package Aula;

public class FuncaoQuadratica {
    private double a;
    private double b;
    private double c;

    public FuncaoQuadratica(double a , double b , double c){

        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double Raiz1( ){

        return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);


    }
    public double Raiz2( ){

        return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    public double XVertice(){
        return -b / (2 * a);
    }

    public double YVertice(){

        return  -(((b * b) - 4 * a * c)/ 4 * a);
    }

    public String Concavidade(){
        String Teste ;
        if(a > 0)
            Teste = "Concavidade para Cima";
        else
            Teste = "Concavidade pra Baixo";

        return Teste;
    }

    public String Descricao() {
        String funcao = String.format("y = %.0fx^2 %s %.0fx %s %.0f",
                a, b >= 0 ? "+" : "-", Math.abs(b), c >= 0 ? "+" : "-", Math.abs(c));
        return funcao;
}
}