package Aula.Heranca.Polimorfismo;
public class Conta {
    protected int numeroconta;
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }

    public void Sacar(double saque) {
        if (saque >= 0 && saque <= this.saldo)
            this.saldo = this.saldo - saque;
    }

    public void Depositar(double deposito) {
        if (deposito > 0) {
            this.saldo = this.saldo + deposito;
        }
    }

    public Conta(int numeroconta , double saldo){
        setNumeroconta(numeroconta);
        setSaldo(saldo);
    }

    public String toString(){
        return "Numero da Conta: "
                +getNumeroconta()
                +", Saldo da conta: "
                +getSaldo();

    }
}

