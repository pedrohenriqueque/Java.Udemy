package Aula.Heranca.Polimorfismo;

public class ContaEspecial extends Conta{
    private double limite;

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void Sacar(double saque) {
        if (saque >= 0 && saque <= this.saldo + getLimite())
            this.saldo = this.saldo - saque ;
    }
    public ContaEspecial(int numeroconta , double saldo , double limite){
        super(numeroconta,saldo);
            setLimite(limite);
    }
    public String toString(){
        return super.toString()
                +", Limite: "
                +this.limite;
    }
}
