package Curso.Java.Udemy;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
            return price * quantity;
    }
    public void addProducts(int quantity){
            this.quantity = this.quantity + quantity;
    }
    public void removeProduct(int quantity){
        if(this.quantity > 0)
            this.quantity = this.quantity - quantity;
    }
    public String toString(){
        return name
                +", $"
                +String.format("%.2f",price)
                +", "
                +quantity
                +" unitis, Total: $ "
                +String.format("%.2f",totalValueInStock());
    }

}
