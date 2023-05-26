package Aula.Heranca;
public class mAtracao {
    public static void main(String[] args) {
        MontanhaRussa montanhaRussa = new MontanhaRussa("Rio de Janeiro", 35 , 35.50 , 1.79);
        System.out.println(montanhaRussa.exibir_informacoes());
        System.out.println("A Arrecadanção maxima é de " +montanhaRussa.arrecadacao_maxima());
        Carrossel carrossel = new Carrossel("Glória", 44 , 12.50 , 13);
        System.out.println(carrossel.exibir_informacoes());
        System.out.println("A Arecadação Maxima é de " + carrossel.arrecadacao_maxima());

        
    }
}
