package Aula.JogoRPG;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TorreEnfeiticada extends ObstaculoBase {
    ArrayList<Inimigo> inimigos;

    public void interageComPersonagem(PersonagemBase personagemBase) {
            int danoRecebido = 0;
            for (Inimigo a : inimigos) {
                if (a.getVida() >= 0) {
                    danoRecebido += a.ataque();
                }
            }
            personagemBase.setCaracteristica(personagemBase.getCaracteristica() - danoRecebido);
            if (personagemBase.getCaracteristica() <= 0)
                throw new RuntimeException("Infelizmente, sua jornada chegou a um fim prematuro. O Lorde das Sombras se\n" +
                        "mostrou um oponente formidável e suas habilidades não foram suficientes para\n" +
                        "derrotá-lo. Apesar de todos os seus esforços, o reino continua envolto em trevas.");
    }

    public void vidaInimigos(){
        for (int i = 1; i <= inimigos.size(); i++) {
            Inimigo a = inimigos.get(i-1);
            if (a.getVida() >= 0) {
                System.out.println(i+"- "+ a);
            }
        }
    }

    public void receberDano(PersonagemBase personagemBase) {
            int danoRecebido = 0;
            do {
                danoRecebido += personagemBase.atacar();
            } while (danoRecebido <= 0);
            if(danoRecebido < 14 || danoRecebido > 30) {
                for (Inimigo a : inimigos) {
                    a.receberDano(danoRecebido);
                }
            }else{
                limparConsole();
                System.out.println("Escolha um inimigo para atacar");
                    int opcao = escolherInimigo() -1;
                Inimigo a = inimigos.get(opcao);
                a.receberDano(danoRecebido);
            }
        inimigos.removeIf(inimigo -> inimigo.getVida() <= 0);
    }


    public void combate(PersonagemBase personagemBase){
        System.out.println("Você chegou a Torre Enfeitiçada!");
        adicionarInimigos(5);
        vidaInimigos();
        do{
            receberDano(personagemBase);
            interageComPersonagem(personagemBase);
            vidaInimigos();
        } while (!inimigos.isEmpty() && personagemBase.getCaracteristica() > 0);
        System.out.println("Você derrotou todos os inimigos");
        tomarPocao(personagemBase);
    }
        public void tomarPocao(PersonagemBase personagemBase) {
            Scanner teclado = new Scanner(System.in);
            boolean passou = false;
            int numero;
            do {
                try {
                    System.out.println("Encontrou uma poção misteriosa! Deseja Toma-lá?\n"
                            + "1 - SIM!\n2 - NÃO!");
                    int opcao = teclado.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("Você tomou a poção!");
                            numero = numeroAleatorio(-15,30);
                            personagemBase.setCaracteristica(personagemBase.getCaracteristica() + numero);
                            if(numero > 0)
                                System.out.println("SORTE! Você ganhou " + numero +" de vida\n\n");
                            else
                                System.out.println("AZAR! Você perdeu " +numero +" de vida\n\n");
                            passou = true;
                            break;
                        case 2:
                            System.out.println("Você não tomou a poção!\n\n");
                            passou = true;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Valor Invalido, digite novamente !");
                }
            } while (!passou);
        }

        public int escolherInimigo(){
            Scanner teclado = new Scanner(System.in);
            int opcao = 0;
            do{
                try{
                    opcao = teclado.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("Digite um Numero Valido");
                }
            }while (opcao >= inimigos.size()+1);
            return  opcao;
        }

    public TorreEnfeiticada() {
        inimigos = new ArrayList<>();
    }

    public void adicionarInimigos(int qtd) {
        for (int i = 0; i < qtd; i++)
            inimigos.add(new Inimigo());
    }


}

