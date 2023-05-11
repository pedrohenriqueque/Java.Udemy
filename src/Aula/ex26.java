package Aula;
import java.util.Scanner;
public class ex26 {

        enum Conceito {
            PESSIMO(0.0, 2.9),
            RUIM(3.0, 4.9),
            REGULAR(5.0, 6.9),
            BOM(7.0, 8.9),
            MUITOBOM(9.0, 10.0);

            private final double notaMin;
            private final double notaMax;

            private Conceito(double notaMin, double notaMax) {
                this.notaMin = notaMin;
                this.notaMax = notaMax;
            }

            public boolean includes(double nota) {
                return nota >= notaMin && nota <= notaMax;
            }
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = input.nextDouble();

        Conceito conceito = null;
        for (Conceito c : Conceito.values()) {
            if (c.includes(nota)) {
                conceito = c;
                break;
            }
        }

        if (conceito == null) {
            System.out.println("Nota invalida");
        } else {
            System.out.println("Conceito: " + conceito);
        }
    }
}



