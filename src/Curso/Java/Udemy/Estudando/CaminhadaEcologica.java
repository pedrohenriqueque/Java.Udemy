package Curso.Java.Udemy.Estudando;

import Curso.Java.Udemy.Estudando.Locadora.NivelDificuldadeException;

public class CaminhadaEcologica extends Atividades{
    private String dificuldade;

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        if(dificuldade.equals("facil") || dificuldade.equals("moderado")|| dificuldade.equals("exigente"))
            this.dificuldade = dificuldade;
        else
            throw new NivelDificuldadeException("Deu ruim aq na dificuldade heim");
    }
    public int calcularTaxaExtra() {
        return super.calcularTaxaExtra(10);
    }
    public CaminhadaEcologica(String horario, String quarto, String funcionario,
                              int duracaoEstipulada, int duracaoTotal, String dificuldade){
        super(horario,quarto,funcionario,duracaoEstipulada,duracaoTotal);
        setDificuldade(dificuldade);
    }

}
