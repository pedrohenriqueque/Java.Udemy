package Aula;

public class Aluno {
    private int matricula;
    private String nome;

    public Aluno(int matricula , String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public String listagem(){
        return "Matricula: "
                +matricula
                +" Nome: "
                +nome;
    }
}
