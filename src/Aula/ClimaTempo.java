package Aula;
class ClimaTempo {
    private double[] pluviosidade;
    private double[] pressao;

    public boolean setPluviosidade(double[] pl) {
        if (pl.length != 7) {
            return false;
        }
        this.pluviosidade = pl;
        return true;
    }

    public boolean setPressao(double[] pr) {
        if (pr.length != 7) {
            return false;
        }
        this.pressao = pr;
        return true;
    }

    public double calcularMediaPluvial() {
        double soma = 0;
        int contador = 0;
        for (int i = 0; i < this.pluviosidade.length; i++) {
            soma += this.pluviosidade[i];
            contador++;
        }
        return soma / contador;
    }

    public double calcularMaximaPluvial() {
        double max = this.pluviosidade[0];
        for (int i = 1; i < this.pluviosidade.length; i++) {
            if (this.pluviosidade[i] > max) {
                max = this.pluviosidade[i];
            }
        }
        return max;
    }

    public double calcularPressaoMinima() {
        double min = this.pressao[0];
        for (int i = 1; i < this.pressao.length; i++) {
            if (this.pressao[i] < min) {
                min = this.pressao[i];
            }
        }
        return min;
    }
}