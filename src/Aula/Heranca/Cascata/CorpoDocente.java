package Aula.Heranca.Cascata;

public class CorpoDocente extends Empregado{
    int cargahoraria;

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public CorpoDocente(String nome , String CPF , int matricula ,double salario, int cargahoraria){
        super(nome, CPF , matricula,salario);
            setCargahoraria(cargahoraria);
    }

    public String toString(){
        return super.toString()
                +", Carga Horaria: "
                +getCargahoraria();
    }
}
