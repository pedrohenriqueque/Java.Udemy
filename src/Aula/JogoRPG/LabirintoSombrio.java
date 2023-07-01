package Aula.JogoRPG;

import java.util.Scanner;

public class LabirintoSombrio extends ObstaculoBase{

    @Override
    public int interageComPersonagem(PersonagemBase personagemBase) {
        return numeroAleatorio(1,15);
    }

    public void labirinto(){
        System.out.println("Você chegou ao Labirinto Sombrio: " +
                "Você deve adivinhar onde estão as armadilhas.");
        int contador = 0;

        do{
            System.out.println("Escolha o Caminho 1 , 2 ou 3");
            Scanner teclado = new Scanner(System.in);
            int opcao = teclado.nextInt();
            int aleatorio = numeroAleatorio(1,3);
            if(aleatorio != opcao){
                interageComPersonagem();
                System.out.println("Você errou o caminho e recebeu dano");
            }else{
                System.out.println("Você passou sem sofrer dano!");
            }

        }while (contador < 3);
    }
}
