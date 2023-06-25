package Aula.HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex47 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = teclado.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(frase);
        Map<String, Integer> contaPalavras = new HashMap<>();

        while (tokenizer.hasMoreTokens()) {
            String palavra = tokenizer.nextToken();


            if (!palavra.isEmpty()) {
                int ocorrencias = contaPalavras.getOrDefault(palavra, 0);
                contaPalavras.put(palavra, ocorrencias + 1);
            }
        }
        System.out.println("Número de palavras: " + contaPalavras.size());
        System.out.println("Ocorrências de cada palavra:");
        for (Map.Entry<String, Integer> mapa : contaPalavras.entrySet()) {
            System.out.println(mapa.getKey() + ": " + mapa.getValue());
        }
    }
}