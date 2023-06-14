package Curso.Java.Udemy.Polimorfismo;

public class ImportedProduct extends Product {
    private double customsFee;

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }
    public double getCustomsFee() {
        return customsFee;
    }
    public double totalPrice(){
        return getPrice() + getCustomsFee();
    }
    public ImportedProduct(String name, double price, double customsFee){
        super(name,price);
        setCustomsFee(customsFee);
    }
@Override
    public String priceTag(){
        return super.priceTag() + customsFee
            +" (Customs fee: $"+getCustomsFee()+")";
    }
}

