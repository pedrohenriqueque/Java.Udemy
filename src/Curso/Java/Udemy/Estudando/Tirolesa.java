package Curso.Java.Udemy.Estudando;

public class Tirolesa extends Atividades implements Seguranca {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) throws TipoTirolesaException {
        if(tipo.equals("lago") || tipo.equals("montanha")){
            this.tipo = tipo;
        }else
            throw new TipoTirolesaException("Deu ruim aq heim");
    }

    public Tirolesa(String horario, String quarto, String funcionario,
                    int duracaoEstipulada, int duracaoTotal,String tipo) throws TipoTirolesaException {
        super(horario,quarto,funcionario,duracaoEstipulada,duracaoTotal);
        setTipo(tipo);
    }


    public int calcularTaxaExtra() {
        return super.calcularTaxaExtra(50);
    }

    @Override
    public String equipamentoSeguranca() {
        if(tipo.equals("montanha"))
            return "Capacete";
        return "";
    }
}
