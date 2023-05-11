package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {


    public static void main(String[] args) {
        double salarioAnual = 70000;

        int[] idade = new int[5];
        double taxa = 0;
          if(salarioAnual > 0 && salarioAnual <= 34712) {
              taxa = salarioAnual *(9.7/100);
          }
          else if(salarioAnual >= 37713 && salarioAnual <= 68508) {
              taxa = salarioAnual * (37.35/100);
          }
          else{
              taxa = salarioAnual * (49.5/100);
          }

          System.out.println(taxa);
    }

}
