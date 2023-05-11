package Aula;

public class Funcionario {

    private String Nome;
    private String Sobrenome;
    private double Salario;

    public Funcionario (String Nome,String Sobrenome , double Salario){
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        if(Salario >= 0 && Salario < 20000)
            this.Salario = Salario;
    }

    public String getNome(){
        return Nome;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public String getSobrenome(){
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome){
        this.Sobrenome = Sobrenome;
    }

    public double getSalario(){
        return Salario;
    }

    public void setSalario(double Salario){
        if(Salario >= 0 && Salario < 20000)
            this.Salario = Salario;
    }
    public void aumentarSalario(double percentual) {
        Salario *= (1 + percentual / 100);
    }
}