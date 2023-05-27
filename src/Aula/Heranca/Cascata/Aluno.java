package Aula.Heranca.Cascata;

public class Aluno extends MembrodaComunidade{
    protected int qtd_materia;
    protected int ano_ingresso;
    protected double CR;

    public void setQtd_materia(int qtd_materia) {
        this.qtd_materia = qtd_materia;
    }

    public int getQtd_materia() {
        return qtd_materia;
    }

    public void setAno_ingresso(int ano_ingresso) {
        this.ano_ingresso = ano_ingresso;
    }

    public int getAno_ingresso() {
        return ano_ingresso;
    }

    public void setCR(double CR) {
        this.CR = CR;
    }

    public double getCR() {
        return CR;
    }

    public Aluno(String nome , String CPF , int matricula , int qtd_materia , int ano_ingresso , double CR){
        super(nome , CPF , matricula);
            setQtd_materia(qtd_materia);
            setAno_ingresso(ano_ingresso);
            setCR(CR);

    }

    public String toString(){
        return super.toString()
                +", Quantidade de Materia: "
                +getQtd_materia()
                +", Ano de Ingresso: "
                +getAno_ingresso()
                +", CR:"
                +getCR();
    }
}
