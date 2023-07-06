package Aula.JogoRPG;

import java.util.ArrayList;
import java.util.Scanner;

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
                }
            }
            personagemBase.setCaracteristica(personagemBase.getCaracteristica() - danoRecebido);
            if(personagemBase.getCaracteristica() <= 0)
                throw new RuntimeException("Infelizmente, sua jornada chegou a um fim prematuro. O Lorde das Sombras se\n" +
                        "mostrou um oponente formidável e suas habilidades não foram suficientes para\n" +
                        "derrotá-lo. Apesar de todos os seus esforços, o reino continua envolto em trevas.");
            System.out.println("Você recebeu " + danoRecebido + " dos seus inimigos");
            for (int i = 0; i < inimigos.size(); i++) {
                Inimigo a = inimigos.get(i);
                if (a.getVida() >= 0) {
                    System.out.println("Inimigo "+i +" Vida: "+a.getVida());
                }
            }
            inimigos.removeIf(inimigo -> inimigo.getVida() <= 0);
        } while (!inimigos.isEmpty() && personagemBase.getCaracteristica() > 0);
            Scanner teclado = new Scanner(System.in);
            boolean passou = false;
            do {
                try {
                    System.out.println("Encontrou uma poção misteriosa! Deseja Toma-lá?\n"
                            +"1 - SIM!\n2 - NÃO!");
                    int opcao = teclado.nextInt();
                    switch(opcao) {
                        case 1:
                            System.out.println("Você tomou a poção!");
                            personagemBase.setCaracteristica(personagemBase.getCaracteristica() - numeroAleatorio(-10, 20));
                            System.out.println("Sua vida agora é " + personagemBase.getCaracteristica());
                            passou = true;
                            break;
                        case 2:
                            System.out.println("Você não tomou a poção!");
                            passou = true;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Valor Invalido, digite novamente !");
                }
            }while (!passou);



        }



    public TorreEnfeiticada() {
        inimigos = new ArrayList<>();
    }

    public void adicionarInimigos(int qtd) {
        for (int i = 0; i < qtd; i++)
            inimigos.add(new Inimigo());
    }


}

