package Aula.JogoRPG;
import java.util.ArrayList;
import java.util.Random;

public abstract class PersonagemBase {
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

    public abstract void ataque1();
    public abstract void ataque2();


}
