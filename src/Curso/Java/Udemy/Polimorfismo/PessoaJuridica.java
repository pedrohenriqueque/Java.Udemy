package Curso.Java.Udemy.Polimorfismo;

public class PessoaJuridica extends Pessoa{
    private int qtdFuncionarios;

    public void setQtdFuncionarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }
    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public PessoaJuridica(String nome, double renda, int qtdFuncionarios){
        super(nome,renda);
        setQtdFuncionarios(qtdFuncionarios);
    }

    @Override
    public double calcularImposto() {
        if(getQtdFuncionarios() > 10){
            return getRenda() * 0.14;
        }

        return getRenda() * 0.16;
    }
}
