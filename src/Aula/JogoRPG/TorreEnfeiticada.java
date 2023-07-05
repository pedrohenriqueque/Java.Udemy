package Aula.JogoRPG;

import java.util.ArrayList;

public class TorreEnfeiticada extends ObstaculoBase{
    ArrayList<Inimigo> inimigos;

    public void interageComPersonagem(PersonagemBase personagemBase) {
        personagemBase.setCaracteristica(personagemBase.getCaracteristica() - numeroAleatorio(7,23));
    }


    public TorreEnfeiticada() {
        inimigos = new ArrayList<>();
    }

    public void adicionarInimigos(int qtd) {
        for(int i = 0 ; i < qtd ; i++)
            inimigos.add(new Inimigo());
    }
}
