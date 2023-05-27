package Aula.Heranca.Cascata;

public class Professor extends CorpoDocente{
    protected String disciplina;

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public Professor(String nome , String CPF , int matricula ,double salario , int cargahoraria, String disciplina){
        super(nome,CPF,matricula,salario,cargahoraria);
        setDisciplina(disciplina);
    }

    public String toString(){
        return super.toString()
                +", Disciplina"
                +getDisciplina();
    }
}
