package Aula.JogoRPG;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Inimigo {
    private int vida;
    private String nome;
    private Random rand = new Random();
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int ataque(){
        Random rand = new Random();
        return rand.nextInt(5) + 2;
    }

    public void receberDano(int dano){
        vida -= dano;
     }
    public String toString(){
        return  getNome()
                +" ,Vida: " +vida;
    }
    public Inimigo(){
        setVida(rand.nextInt(10)+35);
        setNome(gerarNomeAleatorio());
    }

    private String gerarNomeAleatorio() {
        List<String> nomesCompletos = lerNomesCompletosArquivo();
        Random rand = new Random();
        return nomesCompletos.get(rand.nextInt(nomesCompletos.size()));
    }

    private List<String> lerNomesCompletosArquivo() {
        List<String> nomesCompletos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("nomes.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                nomesCompletos.add(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return nomesCompletos;
    }
}


