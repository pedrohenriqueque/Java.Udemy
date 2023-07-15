
package Aula.JogoRPG;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class LabirintoSombrio extends ObstaculoBase{

    @Override
    public void interageComPersonagem(PersonagemBase personagemBase) {
        personagemBase.setCaracteristica(personagemBase.getCaracteristica() - numeroAleatorio(5,15));
        personagemBase.morrer();

    }

    public void labirinto(PersonagemBase personagemBase){
        System.out.println("Você chegou ao "+getNome() +
                ": Você deve adivinhar onde estão as armadilhas.");
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

    }

    public LabirintoSombrio(){
        setNome("Labirinto Sombrio");
    }

}
