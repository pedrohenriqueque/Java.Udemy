package Curso.Java.Udemy.Polimorfismo;

public class PessoaFisica extends Pessoa{
    private double gastos;

    public void setGastos(double gastos) {
        if(gastos >= 0)
            this.gastos = gastos;
    }
    public double getGastos() {
        return gastos;
    }

    public PessoaFisica(String nome, double renda, double gastos){
        super(nome,renda);
        setGastos(gastos);
    }

    @Override
    public double calcularImposto() {
        if(getGastos() > 0) {
            if (getRenda() < 20000) {
                return getRenda() * 0.15 - getGastos() * 0.5;
            } else {
                return getRenda() * 0.25 - getGastos() * 0.5;
            }
        }else {
            if (getRenda() < 20000) {
                return getRenda() * 0.15;
            } else {
                return getRenda() * 0.25;
            }
        }
    }
}
