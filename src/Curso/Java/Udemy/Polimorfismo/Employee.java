package Curso.Java.Udemy.Polimorfismo;

public class Employee {
    private String name;
    private int hours;
    private double valuePerHour;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public double getValuePerHour() {
        return valuePerHour;
    }

    public Employee(String name , int hours , double valuePerHour){
        setName(name);
        setHours(hours);
        setValuePerHour(valuePerHour);
    }
    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double payment(){
        return hours * valuePerHour;
    }

}
