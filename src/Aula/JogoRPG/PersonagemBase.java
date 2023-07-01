package Aula.JogoRPG;
import java.util.Random;

public abstract class PersonagemBase {
    protected String nome;
    protected int idade;
    protected int caracteristica;

    public abstract void contarHistoria();
    public abstract void poderEspecial();

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

    public abstract void ataque1();
    public abstract void ataque2();


}
