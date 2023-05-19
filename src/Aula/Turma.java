package Aula;
import java.util.ArrayList;
public class Turma {
    private int codigo;
    private String descricao;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

}
