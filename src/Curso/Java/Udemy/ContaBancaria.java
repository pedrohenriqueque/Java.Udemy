package Curso.Java.Udemy;

public class ContaBancaria {
    private  final int numeroConta;
    private String titularConta;
    private double saldo;
    private final int taxa = 5;

    public ContaBancaria(int numeroConta , String titularConta , double saldo){
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldo = saldo;
    }
    public ContaBancaria(int numeroConta, String titularConta){
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
    }

    public void setDeposito(double deposito){
        saldo += deposito ;
    }
    public void setSaque(double saque){
        saldo -= saque + taxa;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setTitularConta(String titularConta){
        this.titularConta = titularConta;
    }
    public String toString(){
        return "Account "
                +numeroConta
                +", Holder: "
                +titularConta
                +", Balance: &"
                +String.format("%.2f",saldo);
    }
}
