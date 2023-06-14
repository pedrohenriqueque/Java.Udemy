package Curso.Java.Udemy.Polimorfismo;

public class Product {
    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        if(price > 0)
            this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public Product(String name,double price){
        setName(name);
        setPrice(price);
    }

    public String priceTag(){
        return   getName()
                +"¨ $ "
                + getPrice();
    }
}
