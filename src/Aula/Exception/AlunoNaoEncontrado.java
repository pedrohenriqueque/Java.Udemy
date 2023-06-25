package Aula.Exception;

public class AlunoNaoEncontrado extends RuntimeException{
    AlunoNaoEncontrado(String msg){
        super(msg);
    }
}
