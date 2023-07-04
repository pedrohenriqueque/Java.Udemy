package Aula.JogoRPG;

import java.util.Random;

public abstract class ObstaculoBase implements Obstaculo {

    private String nome;

    public abstract void interageComPersonagem(PersonagemBase personagemBase);

    public String getNome() {
        return nome;
    }

    public int numeroAleatorio(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
