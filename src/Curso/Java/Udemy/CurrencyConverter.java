package Curso.Java.Udemy;

public class CurrencyConverter {
    public static double iof = 6.0;
    public static double convertDollars(double dollars , double dollarPrice){
        return (dollars *  dollarPrice) + (dollars *  dollarPrice) * (iof / 100.0);
    }
}
