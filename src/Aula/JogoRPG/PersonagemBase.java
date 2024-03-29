package Aula.JogoRPG;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public abstract class PersonagemBase implements Personagem {
    protected String nome;
    protected int idade;
    protected int caracteristica;
    protected int usosPoderEspecial = 1;

    protected ArrayList<Item> inventario;

    public void contarHistoria(){
        System.out.println("Nome: "+getNome() +", Vida: "+getCaracteristica() + ", Idade: "+getIdade());
    }
    public abstract int poderEspecial();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCaracteristica(int caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getCaracteristica() {
        return caracteristica;
    }
    public int numeroAleatorio(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public void adicionarItem(Item item) {
        inventario.add(item);
        if (item instanceof AmuletoDaProtecao) {
            AmuletoDaProtecao amuleto = (AmuletoDaProtecao) item;
            int bonusCaracteristica = (int) (caracteristica * 0.15);
            setCaracteristica(caracteristica + bonusCaracteristica);
        }

    }

    public int ataque1(){
        int dano = numeroAleatorio(15,23);
        for (Item item : inventario) {
            if(item instanceof ChapeuDaMagia)
                dano +=5;
        }
        return dano;
    }
    public int ataque2(){
        int dano = numeroAleatorio(4,9);
        for (Item item : inventario) {
            if(item instanceof ChapeuDaMagia)
                dano +=5;
        }
        return dano;
    }

    public int atacar() {
        try {

            int danoTotal;
            Scanner teclado = new Scanner(System.in);
            int opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    danoTotal = ataque1();
                    break;
                case 2:
                    danoTotal = ataque2();
                    break;
                case 3:
                    danoTotal = poderEspecial();
                    break;
                default:
                    throw new InputMismatchException();
            }
            return danoTotal;
        }catch (InputMismatchException e){
            System.out.println("Não foi possível atacar, número inválido");
            return -1;
        }
    }
    public void morrer(){
        if(caracteristica <= 0){
            throw new RuntimeException("Infelizmente, sua jornada chegou a um fim prematuro. O Lorde das Sombras se\n" +
                    "mostrou um oponente formidável e suas habilidades não foram suficientes para\n" +
                    "derrotá-lo. Apesar de todos os seus esforços, o reino continua envolto em trevas.");
        }
    }
}
