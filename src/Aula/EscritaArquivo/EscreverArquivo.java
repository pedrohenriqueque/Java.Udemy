
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
public class EscreverArquivo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        PrintWriter arquivo = null;
        try{
            FileWriter out = new FileWriter("nomes.txt");
            arquivo = new PrintWriter(out);
            for(int i = 0; i < 5 ; i++){
                System.out.println("Nome: ");
                arquivo.println(teclado.nextLine());
                System.out.println("Telefone");
                arquivo.println(teclado.nextLine());
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            arquivo.close();
        }

    }
}
