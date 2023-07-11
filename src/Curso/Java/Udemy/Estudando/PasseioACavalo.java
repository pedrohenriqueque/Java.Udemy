package Curso.Java.Udemy.Estudando;

public class PasseioACavalo extends Atividades implements Seguranca{
    private String identificacaoCavalo;

    public void setIdentificacaoCavalo(String identificacaoCavalo) {
        this.identificacaoCavalo = identificacaoCavalo;
    }

    public String getIdentificacaoCavalo() {
        return identificacaoCavalo;
    }

    @Override
    public String equipamentoSeguranca() {
        return "Capacete";
    }
    public int calcularTaxaExtra() {
        return super.calcularTaxaExtra(60);
    }
    public PasseioACavalo(String horario, String quarto, String funcionario,
                          int duracaoEstipulada, int duracaoTotal, String identificacaoCavalo){
        super(horario,quarto,funcionario,duracaoEstipulada,duracaoTotal);
        setIdentificacaoCavalo(identificacaoCavalo);
    }
}
