package Aula.JogoRPG;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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

            boolean valida = false;
            if(opcao == 1) {
                System.out.println("Você escolheu Arthur");
                System.out.println("Escolha um Item para o seu inventario: ");
                System.out.println(tomo);
                System.out.println(chapeu);
                System.out.println(amuleto);
                opcao = teclado.nextInt();
            do {
                try {
                    switch (opcao) {
                        case 1:
                            arthur.adicionarItem(tomo);
                            valida = true;
                            break;
                        case 2:
                            arthur.adicionarItem(chapeu);
                            valida = true;
                            break;
                        case 3:
                            arthur.adicionarItem(amuleto);
                            valida = true;
                            break;
                        default:
                            throw new InputMismatchException();
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Opção inválida para escolher um item.");
                    teclado.nextLine();
                }
            }while (!valida);
                System.out.println("Você chegou ao Labirinto Sombrio");
                LabirintoSombrio labirintoSombrio = new LabirintoSombrio();
                labirintoSombrio.labirinto(arthur);
                TorreEnfeiticada torre = new TorreEnfeiticada();
                torre.interageComPersonagem(arthur);
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
                switch (opcao) {
                    case 1:
                        elysia.adicionarItem(tomo);
                        break;
                    case 2:
                        elysia.adicionarItem(chapeu);
                        break;
                    case 3:
                        elysia.adicionarItem(amuleto);
                        break;
                    default:
                        throw new InputMismatchException("Opção inválida para escolher um item.");
                }
                System.out.println("Você chegou ao Labirinto Sombrio");
                LabirintoSombrio labirintoSombrio = new LabirintoSombrio();
                labirintoSombrio.labirinto(elysia);
                TorreEnfeiticada torre = new TorreEnfeiticada();
                torre.interageComPersonagem(elysia);
                System.out.println("Você chegou ao castelo do Lorde das Sombras");
                LordeDasSombras lorde = new LordeDasSombras();
                lorde.combate(elysia);
            }else {
                throw new InputMismatchException("Opção invalida de personagem");
            }
        }

    }

