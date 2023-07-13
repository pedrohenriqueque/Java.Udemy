package Aula.JogoRPG;

import java.util.Random;

public abstract class ObstaculoBase implements Obstaculo {

    private String nome;

    public abstract void interageComPersonagem(PersonagemBase personagemBase);

    public String getNome() {
        return nome;
    }

    public int numeroAleatorio(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
    public void limparConsole() {
            try {
                final String os = System.getProperty("os.name");
                if (os.contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } else {
                    Runtime.getRuntime().exec("clear");
                }
            } catch (final Exception e) {
                System.out.println("Erro ao limpar o console: " + e.getMessage());
            }
        }
    }


