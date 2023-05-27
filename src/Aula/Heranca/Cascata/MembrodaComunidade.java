package Aula.Heranca.Cascata;

public class MembrodaComunidade {
    protected String nome;
    protected String CPF;
    protected int matricula;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public MembrodaComunidade(String nome , String CPF , int matricula){
        setNome(nome);
        setCPF(CPF);
        setMatricula(matricula);
    }

    public String toString(){
        return "Nome: "
                +getNome()
                +", CPF: "
                +getCPF()
                +", Matricula: "
                +getMatricula();
    }
}
