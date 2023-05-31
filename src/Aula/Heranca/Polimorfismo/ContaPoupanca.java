package Aula.Heranca.Polimorfismo;

public class ContaPoupanca extends Conta{

    public void render(double rendimento){
        this.saldo = this.saldo + this.saldo * rendimento/100.0;
    }

    public ContaPoupanca(int numeroconta, double salario){
        super(numeroconta,salario);
    }
}
