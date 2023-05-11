package Curso.Java.Udemy;

import static java.lang.Math.sqrt;

public class Retangulo {

    public double width;
    public double height;

    public double calArea(){
        return width * height;
    }
    public double calPerimeter(){
        return (width * 2) + (height * 2);
    }

    public double calDiagonal(){
        return sqrt((width * width) + (height * height));
    }

    public String toString(){
        return "Area = "
                +String.format("%.2f",calArea())
                +"\nPerimetro = "
                +String.format("%.2f",calPerimeter())
                +"\nDiagonal = "
                +String.format("%.2f",calDiagonal());

    }
}
