package Aula;
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (!ehDataValida(dia, mes, ano)) {
            System.out.println("Data inválida");
            return;
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (ehDataValida(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (ehDataValida(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ehDataValida(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido");
        }
    }

    public boolean ehDataValida(int dia, int mes, int ano) {
        if (ano < 0) {
            return false;
        } else if (mes < 1 || mes > 12) {
            return false;
        } else if (dia < 1) {
            return false;
        } else if (mes == 2) {
            if (ehBissexto(ano)) {
                return dia <= 29;
            } else {
                return dia <= 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        } else {
            return dia <= 31;
        }
    }

    public boolean ehBissexto(int ano) {
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimeData() {
        System.out.printf("%02d/%02d/%04d\n", dia, mes, ano);
    }
}