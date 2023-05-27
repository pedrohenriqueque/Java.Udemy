package Aula.Heranca.Cascata;

public class Funcionarios extends Empregado {
    protected String cargo;

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public Funcionarios(String nome, String CPF, int matricula, double salario, String cargo) {
        super(nome, CPF, matricula,salario);
            setCargo(cargo);
    }

    public String toString(){
        return super.toString()
                +", Cargo: "
                +getCargo();
    }
}
