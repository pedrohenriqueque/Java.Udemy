package Aula.Exception;

public class mTurma {
    public static void main(String[] args) {
        Turma turma = new Turma();

        Aluno aluno1 = new Aluno("João", 123);
        Aluno aluno2 = new Aluno("Maria", 456);
        Aluno aluno3 = new Aluno("Ana",425);
        turma.addAluno(aluno1);
        turma.addAluno(aluno2);
        if (turma.alunos.contains(aluno2)) {
            System.out.println("Aluno encontrado na lista da turma ");
        } else {
            System.out.println("Aluno não encontrado na lista da turma");
        }

        try{
            turma.encontrarAluno(aluno1);
            turma.encontrarAluno(aluno3);
        }catch (AlunoNaoEncontrado a){
            System.out.println(a.getMessage());
        }

    }
}
