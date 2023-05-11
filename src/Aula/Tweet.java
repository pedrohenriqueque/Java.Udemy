package Aula;
import java.util.Random;

public class Tweet {
    private String paragrafo;

    public Tweet(String paragrafo) {
        setParagrafo(paragrafo);
    }

    public String getParagrafo() {
        return paragrafo;
    }
    public void setParagrafo(String paragrafo) {
        if(paragrafo.length() <= 144) {
            this.paragrafo = paragrafo;
        }else{
            System.out.println("O paragrafo deve ter no máximo 144 caracteres");
        }
    }

    public int ContaCaracters(){
        return paragrafo.length();
    }
    public int ContaPalavras(){
        String[] palavras = paragrafo.split(" ");
        return palavras.length;
    }
    public int ContaFrases(){
        String[] frases = paragrafo.split("\\.");
        return frases.length;
    }
    public int Recorrencia(String palavra){
        String[] palavras = paragrafo.split(" ");
        int contador = 0;
        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].equals(palavra)) {
                contador++;
            }
        }
        return contador;
    }
    public static String ParagrafoAleatorio() {
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        int tamanho = rand.nextInt(144) + 1;
        for (int i = 0; i < tamanho; i++) {
            int index = rand.nextInt(letters.length());
            sb.append(letters.charAt(index));
        }
        return sb.toString();
    }
}