package Aula.Heranca;
public class mJuros {
    public static void main(String[] args) {
       JurosSimples jurosSimples = new JurosSimples(2000 , 0.03 ,3);
       jurosSimples.calcularJuros();
       System.out.println("O Juros Simples é de " +jurosSimples.getJuros());
       JurosCompostos jurosCompostos = new JurosCompostos(2000 , 0.03 , 3);
       jurosCompostos.calcularJuros();
        System.out.println("O Juros Compostos é de  " +jurosCompostos.getJuros());
    }
}
