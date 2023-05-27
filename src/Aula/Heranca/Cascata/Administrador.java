package Aula.Heranca.Cascata;

public class Administrador extends CorpoDocente{
    protected String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Administrador(String nome , String CPF , int matricula , double salario , int cargahoraria , String setor){
        super(nome,CPF,matricula,salario,cargahoraria);
        setSetor(setor);
    }

    public String toString(){
        return super.toString()
                +", Setor: "
                +getSetor();
    }

}
