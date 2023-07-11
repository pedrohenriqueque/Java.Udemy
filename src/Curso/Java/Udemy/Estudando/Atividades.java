package Curso.Java.Udemy.Estudando;

public abstract class Atividades {
    private String horario;
    private String quarto;
    private String funcionario;
    private int duracaoEstipulada;
    private int duracaoTotal;

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public void setDuracaoTotal(int duracaoTotal) {
        this.duracaoTotal = duracaoTotal;
    }

    public void setDuracaoEstipulada(int duracaoEstipulada) {
        this.duracaoEstipulada = duracaoEstipulada;
    }

    public int getDuracaoEstipulada() {
        return duracaoEstipulada;
    }

    public int getDuracaoTotal() {
        return duracaoTotal;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public String getHorario() {
        return horario;
    }

    public String getQuarto() {
        return quarto;
    }

    public int calcularTaxaExtra(int taxa){
        if(duracaoTotal > duracaoEstipulada)
            return taxa;

        return 0;
    }

    public Atividades(String horario, String quarto, String funcionario,
                      int duracaoEstipulada, int duracaoTotal){
        setHorario(horario);
        setQuarto(quarto);
        setFuncionario(funcionario);
        setDuracaoEstipulada(duracaoEstipulada);
        setDuracaoTotal(duracaoTotal);
    }

}
