package Aula.Heranca.Cascata;

public class Empregado extends MembrodaComunidade {
    protected double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public Empregado(String nome, String CPF, int matricula, double salario) {
        super(nome, CPF, matricula);
        setSalario(salario);
    }

    public String toString(){
        return super.toString()
                +", Salario: "
                +getSalario();
    }
}
