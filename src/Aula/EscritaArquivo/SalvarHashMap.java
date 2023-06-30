import java.io.FileReader;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class SalvarHashMap {
    public static void main(String[] args) {
        Scanner arquivo = null;
        Scanner teclado = new Scanner(System.in);
        try {
            FileReader in = new FileReader("nomes.txt");
            arquivo = new Scanner(in);
            HashMap<String,String> mapa= new HashMap<>();
            for (int i = 0; i < 5; i++) {
                mapa.put(arquivo.nextLine(),arquivo.nextLine());

            }
            System.out.println("Digite um nome para buscar");
            String nome = teclado.nextLine();
            System.out.println(mapa.get(nome));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            arquivo.close();
        }

    }
}