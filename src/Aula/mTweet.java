package Aula;

import java.util.Scanner;

public class mTweet {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String paragrafo = teclado.nextLine();
        Tweet tweet = new Tweet(paragrafo);
        System.out.println("Digite a Palavra de Recorrencia: ");
        String recorrencia = teclado.nextLine();
        System.out.println("Parágrafo: " + tweet.getParagrafo());
        System.out.println("Quantidade de caracteres: " + tweet.ContaCaracters());
        System.out.println("Quantidade de palavras: " + tweet.ContaPalavras());
        System.out.println("Quantidade de frases: " + tweet.ContaFrases());
        System.out.println("Recorrência da palavra : " + tweet.Recorrencia(recorrencia));

        System.out.println("Gerar um parágrafo aleatório: ");
        String paragrafoAleatorio = Tweet.ParagrafoAleatorio();
        System.out.println(paragrafoAleatorio);
    }
}







