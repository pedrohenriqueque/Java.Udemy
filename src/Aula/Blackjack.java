package Aula;
import java.util.Random;

public class Blackjack {
    enum Carta {
         DOIS(2), TRES(3), QUATRO(4), CINCO(5), SEIS(6), SETE(7), OITO(8), NOVE(9), DEZ(10), VALETE(10), DAMA(10),REI(10), AS(11);
        private final int valor;

        Carta(int valor) {
            this.valor = valor;
        }

        public int getValor() {
            return valor;
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Carta j1 = Carta.values()[random.nextInt(Carta.values().length)];
        Carta j2 = Carta.values()[random.nextInt(Carta.values().length)];

        System.out.println("A Carta do Jogador 1 é "+j1);
        System.out.println("A Carta do Jogador 2 é " +j2);
        if (j1.getValor() > j2.getValor())
            System.out.println("O jogador 1 ganhou com a carta " + j1);
        else if (j2.getValor() > j1.getValor())
            System.out.println("O jogador 2 ganhou com a carta " + j2);
        else
            System.out.println("Empate");
    }
}