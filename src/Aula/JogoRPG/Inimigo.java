package Aula.JogoRPG;

import java.util.Random;

public class Inimigo {
    private int vida;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int ataque(){
        Random rand = new Random();
        return rand.nextInt(4) + 1;
    }
}
