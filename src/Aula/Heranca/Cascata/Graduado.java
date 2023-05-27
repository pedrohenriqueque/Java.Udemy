package Aula.Heranca.Cascata;

public class Graduado extends MembrodaComunidade{
    protected int ano_de_conclusao;
    protected String curso;
    protected String TCC;

    public void setAno_de_conclusao(int ano_de_conclusao) {
        this.ano_de_conclusao = ano_de_conclusao;
    }

    public int getAno_de_conclusao() {
        return ano_de_conclusao;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public String getTCC() {
        return TCC;
    }

    public void setTCC(String TCC) {
        this.TCC = TCC;
    }

    public Graduado(String nome , String CPF , int matricula , int ano_de_conclusao , String curso , String TCC){
        super(nome , CPF , matricula);
        setAno_de_conclusao(ano_de_conclusao);
        setCurso(curso);
        setTCC(TCC);
    }

    public String toString(){
        return super.toString()
                +", Ano de Conclusão: "
                +getAno_de_conclusao()
                +", Curso: "
                +getCurso()
                +", TCC: "
                +getTCC();

    }
}
