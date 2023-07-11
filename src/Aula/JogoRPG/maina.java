package Aula.JogoRPG;
import java.util.InputMismatchException;
import java.util.Scanner;
public class maina {
    private static final int OPCAO_ARTHUR = 1;
    private static final int OPCAO_ELYSIA = 2;

    public static void main(String[] args) {
        boolean passou = false;
        Scanner teclado = new Scanner(System.in);
        Personagem personagem = null;
        do {
            try {
                apresentarHistorias();

                int opcaoPersonagem = selecionarPersonagem(teclado);
                personagem = criarPersonagem(opcaoPersonagem);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }catch (InputMismatchException e){
                System.out.println("Digite um valor válido");
                teclado.nextLine();
            }
        }while (personagem == null);
         do{
            try {
                System.out.println("Escolha um item para o seu inventário:");
                exibirItensDisponiveis();
                int opcaoItem = lerOpcao(teclado);
                Item itemSelecionado = criarItem(opcaoItem);
                personagem.adicionarItem(itemSelecionado);
                passou = true;

                jogarLabirinto(personagem);
                jogarTorre(personagem);
                lutarComLordeDasSombras(personagem);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
             }
        } while (!passou);
    }

        private static void apresentarHistorias () {
            Personagem1 arthur = new Personagem1();
            Personagem2 elysia = new Personagem2();
            arthur.contarHistoria();
            System.out.println("\n");
            elysia.contarHistoria();
        }

        private static int selecionarPersonagem (Scanner teclado){
            System.out.println("Escolha um personagem para jogar:");
            System.out.println(OPCAO_ARTHUR + " - Arthur");
            System.out.println(OPCAO_ELYSIA + " - Elysia");
            return teclado.nextInt();
        }

        private static Personagem criarPersonagem ( int opcaoPersonagem){
            switch (opcaoPersonagem) {
                case OPCAO_ARTHUR:
                    System.out.println("Você escolheu Arthur");
                    return new Personagem1();
                case OPCAO_ELYSIA:
                    System.out.println("Você escolheu Elysia");
                    return new Personagem2();
                default:
                    throw new IllegalArgumentException("Opção de personagem inválida.");
            }
        }

        private static void exibirItensDisponiveis () {
            TomoAmplificador tomo = new TomoAmplificador();
            ChapeuDaMagia chapeu = new ChapeuDaMagia();
            AmuletoDaProtecao amuleto = new AmuletoDaProtecao();
            System.out.println(tomo);
            System.out.println(chapeu);
            System.out.println(amuleto);
        }

        private static Item criarItem ( int opcaoItem){
            switch (opcaoItem) {
                case 1:
                    return new TomoAmplificador();
                case 2:
                    return new ChapeuDaMagia();
                case 3:
                    return new AmuletoDaProtecao();
                default:
                    throw new IllegalArgumentException("Opção de item inválida.");
            }
        }

        private static void jogarLabirinto (Personagem personagem){
            System.out.println("Você chegou ao Labirinto Sombrio");
            LabirintoSombrio labirintoSombrio = new LabirintoSombrio();
            labirintoSombrio.labirinto((PersonagemBase) personagem);
        }

        private static void lutarComLordeDasSombras (Personagem personagem){
            System.out.println("Você chegou ao castelo do Lorde das Sombras");
            LordeDasSombras lorde = new LordeDasSombras();
            lorde.combate((PersonagemBase) personagem);
        }

        private static void jogarTorre (Personagem personagem){
            TorreEnfeiticada torre = new TorreEnfeiticada();
            torre.combate((PersonagemBase) personagem);
        }
        private static int lerOpcao (Scanner teclado){
            while (true) {
                try {
                    return teclado.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, insira um valor numérico.");
                    teclado.nextLine();
                }
            }
        }
    }

