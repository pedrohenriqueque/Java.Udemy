package Aula.Exception;

public class Aluno {
    protected String nome;
    protected int matricula;

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aluno aluno = (Aluno) obj;
        return matricula == aluno.matricula;
    }
    public Aluno(String nome,int matricula){
        setNome(nome);
        setMatricula(matricula);
    }
}