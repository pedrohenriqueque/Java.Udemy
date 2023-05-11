package Aula;
import java.util.Scanner;

public class mData {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o dia:");
        int Dia = teclado.nextInt();

        System.out.println("Digite o mês:");
        int Mes = teclado.nextInt();

        System.out.println("Digite o ano:");
        int Ano = teclado.nextInt();

        Data data = new Data(Dia, Mes, Ano);

        if (data.ehDataValida(Dia,Mes,Ano)) {
            System.out.print("Data valida: ");
            data.imprimeData();
            System.out.println("eh bissexto: " + data.ehBissexto(Ano));
        } else {
            System.out.println("Data invalida");
        }
    }
}