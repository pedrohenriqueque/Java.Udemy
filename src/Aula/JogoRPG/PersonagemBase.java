package Aula.JogoRPG;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public abstract class PersonagemBase implements Personagem {
    protected String nome;
    protected int idade;
    protected int caracteristica;

    ArrayList<Item> inventario;

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
        int dano = numeroAleatorio(8,15);
        for (Item item : inventario) {
            if(item instanceof ChapeuDaMagia)
                dano +=5;
        }
        return dano;
    }
    public int ataque2(){
        int dano = numeroAleatorio(4,8);
        for (Item item : inventario) {
            if(item instanceof ChapeuDaMagia)
                dano +=5;
        }
        return dano;
    }

    public int atacar(){
        int danoTotal;
        Scanner teclado = new Scanner(System.in);
        int opcao = teclado.nextInt();
        if (opcao == 1) {
            danoTotal = ataque1();
        } else if (opcao == 2) {
            danoTotal = ataque2();
        } else {
            danoTotal = poderEspecial();
        }

        return danoTotal;
    }

}
