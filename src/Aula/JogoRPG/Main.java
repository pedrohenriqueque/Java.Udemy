package Aula.JogoRPG;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try {
            Personagem1 arthur = new Personagem1();
            Personagem2 elysia = new Personagem2();

            arthur.contarHistoria();
            elysia.contarHistoria();
            System.out.println("Escolha um Personagem para Jogar: ");
            System.out.println("Você escolheu Elysia");
            
            System.out.println("Escolha um Item para o seu inventario: ");
            TomoAmplificador tomo = new TomoAmplificador();
            ChapeuDaMagia chapeu = new ChapeuDaMagia();
            AmuletoDaProtecao amuleto = new AmuletoDaProtecao();
            System.out.println(tomo);
            System.out.println(chapeu);
            System.out.println(amuleto);
            elysia.adicionarItem(amuleto);
            elysia.adicionarItem(chapeu);
            System.out.println("Você chegou ao Labirinto Sombrio");
            LabirintoSombrio labirintoSombrio = new LabirintoSombrio();
            labirintoSombrio.labirinto(elysia);
            System.out.println("Você chegou ao castelo do Lorde das Sombras");
            LordeDasSombras lorde = new LordeDasSombras();
            lorde.combate(elysia);
        } catch (InputMismatchException i) {
            System.out.println(i.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
