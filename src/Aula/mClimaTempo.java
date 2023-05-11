package Aula;

public class mClimaTempo {
    public static void main(String[] args) {
        // vetores criados simplesmente para testar a classe
        double[] chuva = {5.34, 2.34, 0.0, 0.0, 3.23, 0.0, 2.42};
        double[] pressao = {99.3, 95.34, 101.3, 98.42, 103.4, 100.0, 102.87};
        ClimaTempo ct = new ClimaTempo();
        ct.setPluviosidade(chuva);
        ct.setPressao(pressao);
        // deve resultar 5.34
        System.out.printf("Maxima pluvial: %f\n", ct.calcularMaximaPluvial());
        // deve resultar ~ 1.904
        System.out.printf("Media pluvial: %f\n", ct.calcularMediaPluvial());
        // deve resultar 95.34
        System.out.printf("Pressao minima: %f\n", ct.calcularPressaoMinima());
    }
}