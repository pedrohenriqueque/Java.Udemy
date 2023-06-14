package Curso.Java.Udemy.Polimorfismo;

public class OutSourcedEmployee extends Employee{
    private double additionalCharge;

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public OutSourcedEmployee(String name, int hours, double valuePerHour,double additionalCharge){
        super(name,hours,valuePerHour);
        setAdditionalCharge(additionalCharge);
    }
    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}
