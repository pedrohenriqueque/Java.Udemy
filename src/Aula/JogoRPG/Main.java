package Aula.JogoRPG;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner teclado = new Scanner(System.in);
            Personagem1 arthur = new Personagem1();
            Personagem2 elysia = new Personagem2();
            TomoAmplificador tomo = new TomoAmplificador();
            ChapeuDaMagia chapeu = new ChapeuDaMagia();
            AmuletoDaProtecao amuleto = new AmuletoDaProtecao();
            arthur.contarHistoria();
            elysia.contarHistoria();
            System.out.println("Escolha um Personagem para Jogar: ");
            System.out.println("1 - Arthur");
            System.out.println("2 - Elysia");
            int opcao = teclado.nextInt();
            if(opcao == 1) {
                System.out.println("Você escolheu Arthur");
                System.out.println("Escolha um Item para o seu inventario: ");
                System.out.println(tomo);
                System.out.println(chapeu);
                System.out.println(amuleto);
                opcao = teclado.nextInt();
                if(opcao == 1){
                    arthur.adicionarItem(tomo);
                }else if(opcao == 2){
                    arthur.adicionarItem(chapeu);
                }else {
                    arthur.adicionarItem(amuleto);
                }
                System.out.println("Você chegou ao Labirinto Sombrio");
                LabirintoSombrio labirintoSombrio = new LabirintoSombrio();
                labirintoSombrio.labirinto(arthur);
                System.out.println("Você chegou ao castelo do Lorde das Sombras");
                LordeDasSombras lorde = new LordeDasSombras();
                lorde.combate(arthur);
            }
            else if(opcao == 2) {
                System.out.println("Você escolheu Elysia");
                System.out.println("Escolha um Item para o seu inventario: ");
                System.out.println(tomo);
                System.out.println(chapeu);
                System.out.println(amuleto);
                opcao = teclado.nextInt();
                if(opcao == 1){
                    elysia.adicionarItem(tomo);
                }else if(opcao == 2){
                    elysia.adicionarItem(chapeu);
                }else {
                    elysia.adicionarItem(amuleto);
                }
                System.out.println("Você chegou ao Labirinto Sombrio");
                LabirintoSombrio labirintoSombrio = new LabirintoSombrio();
                labirintoSombrio.labirinto(elysia);
                System.out.println("Você chegou ao castelo do Lorde das Sombras");
                LordeDasSombras lorde = new LordeDasSombras();
                lorde.combate(elysia);
            }
        } catch (InputMismatchException i) {
            System.out.println(i.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
