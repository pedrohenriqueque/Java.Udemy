
package Aula.JogoRPG;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LabirintoSombrio extends ObstaculoBase{

    @Override
    public void interageComPersonagem(PersonagemBase personagemBase) {
        personagemBase.setCaracteristica(personagemBase.getCaracteristica() - numeroAleatorio(5,15));

    }

    public void labirinto(PersonagemBase personagemBase){
        System.out.println("Você chegou ao Labirinto Sombrio: " +
                "Você deve adivinhar onde estão as armadilhas.");
        int contador = 0;

        do{
            try {
                System.out.println("Escolha o Caminho 1 , 2 ou 3");
                Scanner teclado = new Scanner(System.in);
                int opcao = teclado.nextInt();
                int aleatorio = numeroAleatorio(1, 3);
                if (opcao < 1 || opcao > 3) {
                    throw new InputMismatchException();
                }
                if (aleatorio != opcao) {
                    interageComPersonagem(personagemBase);
                    System.out.println("Você errou o caminho e recebeu dano");
                    if(personagemBase.getCaracteristica() > 0)
                        System.out.println("Você tem agora " + personagemBase.getCaracteristica());
                } else {
                    System.out.println("Você passou sem sofrer dano!");
                }
                contador++;
            }catch (InputMismatchException e){
                System.out.println("Digite um número válido (1, 2 ou 3)");
            }
        }while (contador < 3 && personagemBase.getCaracteristica() > 0);
        if(personagemBase.getCaracteristica() < 0){

            throw new RuntimeException("Infelizmente, sua jornada chegou a um fim prematuro. O Lorde das Sombras se\n" +
                    "mostrou um oponente formidável e suas habilidades não foram suficientes para\n" +
                    "derrotá-lo. Apesar de todos os seus esforços, o reino continua envolto em trevas.");
        }

    }


}
