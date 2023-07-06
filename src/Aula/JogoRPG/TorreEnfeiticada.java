package Aula.JogoRPG;

import java.util.ArrayList;

public class TorreEnfeiticada extends ObstaculoBase {
    ArrayList<Inimigo> inimigos;

    public void interageComPersonagem(PersonagemBase personagemBase) {
        System.out.println("Você chegou a Torre Enfeitiçada!");
        adicionarInimigos(5);
        do {
            int danoCausado = 0;
                do{
                     danoCausado += personagemBase.atacar();
                }while (danoCausado < 0);
            int danoRecebido = 0;
            for (Inimigo a : inimigos) {
                if(a.getVida() >= 0) {
                    danoRecebido += a.ataque();
                    a.receberDano(danoCausado);
                        if(a.getVida() >=0)
                            System.out.println(a);
                }else
                    System.out.println("O Inimigo morreu!");
            }
            personagemBase.setCaracteristica(personagemBase.getCaracteristica() - danoRecebido);
            if(personagemBase.getCaracteristica() <= 0)
                throw new RuntimeException("Infelizmente, sua jornada chegou a um fim prematuro. O Lorde das Sombras se\n" +
                        "mostrou um oponente formidável e suas habilidades não foram suficientes para\n" +
                        "derrotá-lo. Apesar de todos os seus esforços, o reino continua envolto em trevas.");
            System.out.println("Você recebeu " + danoRecebido + " dos seus inimigos");
            System.out.println("Você causou " + danoCausado + " aos seus inimigos");
            inimigos.removeIf(inimigo -> inimigo.getVida() <= 0);
        } while (!inimigos.isEmpty() && personagemBase.getCaracteristica() > 0);
        if(inimigos.isEmpty()) {
            System.out.println("Você derrotou os inimigos com sucesso!\n"
                    + "Encontrou uma poção misteriosa! Deseja Toma-lá?\n"
                    +"1 - SIM!\n 2- NÃO!");
             personagemBase.setCaracteristica(personagemBase.getCaracteristica() - numeroAleatorio(-10,20));
            System.out.println("Sua vida agora é "+personagemBase.getCaracteristica());

        }
    }


    public TorreEnfeiticada() {
        inimigos = new ArrayList<>();
    }

    public void adicionarInimigos(int qtd) {
        for (int i = 0; i < qtd; i++)
            inimigos.add(new Inimigo());
    }


}

