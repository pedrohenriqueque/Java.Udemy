package Curso.Java.Udemy.Exception;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getHolder() {
        return holder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public Account(int number, String holder, double balance, double withdrawLimit){
        setNumber(number);
        setHolder(holder);
        setBalance(balance);
        setWithdrawLimit(withdrawLimit);
    }

    public void deposit(double amount){
            balance += amount;
    }

    public void withdraw(double amount){
        validateWithdraw(amount);
        balance -= amount;
    }

    private void validateWithdraw(double amount){
        if(amount > getWithdrawLimit()){
            throw new BusinessException("Withdraw error: The amount exceeds withdraw limit");
        }
        if(amount > getBalance()){
            throw new BusinessException("Withdraw error: Not enough balance");
        }
    }

}

