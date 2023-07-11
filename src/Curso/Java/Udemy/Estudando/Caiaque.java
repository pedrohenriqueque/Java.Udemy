package Curso.Java.Udemy.Estudando;

public class Caiaque extends Atividades implements Seguranca{
    private String identificacaoCaiaque;

    public void setIdentificacaoCaiaque(String identificacaoCaiaque) {
        this.identificacaoCaiaque = identificacaoCaiaque;
    }

    public String getIdentificacaoCaiaque() {
        return identificacaoCaiaque;
    }

    @Override
    public String equipamentoSeguranca() {
        return "Colete salva-vidas";
    }
    public int calcularTaxaExtra() {
        return super.calcularTaxaExtra(20);
    }
    public Caiaque(String horario, String quarto, String funcionario,
                   int duracaoEstipulada, int duracaoTotal, String identificacaoCaiaque){
        super(horario,quarto,funcionario,duracaoEstipulada,duracaoTotal);
        setIdentificacaoCaiaque(identificacaoCaiaque);
    }
}
