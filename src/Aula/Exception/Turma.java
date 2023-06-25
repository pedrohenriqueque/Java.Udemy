package Aula.Exception;

import java.util.ArrayList;

public class Turma {
    public ArrayList<Aluno> alunos;

    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void encontrarAluno(Aluno aluno){
        if(alunos.contains(aluno)){
            System.out.println("Aluno encontrando: Nome: "+aluno.getNome() + ",Matricula: "+  aluno.getMatricula());
        }else{
            throw new AlunoNaoEncontrado("O Aluno: " +aluno.getNome() + " não foi encontrado");
        }
    }
    public Turma(){
        this.alunos =  new ArrayList<>();
    }
}