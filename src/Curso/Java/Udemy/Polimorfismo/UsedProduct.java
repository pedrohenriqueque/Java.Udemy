package Curso.Java.Udemy.Polimorfismo;

public class UsedProduct extends Product {
    private String manufactureDate;

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(String name, double price, String manufactureDate){
        super(name,price);
        setManufactureDate(manufactureDate);
    }
@Override
    public String priceTag(){
        return getName() +" (used)"
                +" & " + getPrice() + " Manufacture date: " + getManufactureDate();
    }
}
