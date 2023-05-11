package Curso.Java.Udemy;

import java.util.Scanner;

public class mStudent {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        Student student = new Student();
        student.name = teclado.nextLine();
        student.grade1 = teclado.nextDouble();
        student.grade2 = teclado.nextDouble();
        student.grade3 = teclado.nextDouble();

        System.out.println("FINAL GRADE = " + student.finalGrade());

        if(student.finalGrade() >= 60.0){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAILED");
            System.out.println("MISSING "+student.missingPoints());
        }
    }
}
