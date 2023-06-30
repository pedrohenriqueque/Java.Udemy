import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class LerCSV {
    public static void main(String[] args) {
        Scanner arquivo = null;
        ArrayList<Produto> produtos = new ArrayList<>();
        try{
            FileReader in = new FileReader("items.csv");
            arquivo = new Scanner(in);
                arquivo.nextLine();
                //for(int i = 0 ; i < 5 ; i++){
                while (arquivo.hasNext()){
                    String linhaRecebida = arquivo.nextLine();
                    String [] textoseparado = linhaRecebida.split(";");
                    int preco = Integer.parseInt(textoseparado[2]);
                    int qtd = Integer.parseInt(textoseparado[3]);
                    Produto produto = new Produto(textoseparado[0],textoseparado[1],preco,qtd);
                    produtos.add(produto);
            }
            /*for(Produto a : produtos){
                System.out.println("Codigo: " +a.getCodigo());
                System.out.println("Produto: " + a.getProduto());
                System.out.println("Preco: "+ a.getPreco());
                System.out.println("Quantidade: " +a.getPreco());
                System.out.println("----------------------------------------------------------------");
            }
        */
            Collections.sort(produtos);
            System.out.println("Vendedor os Seguintes item esão em falta: ");
            for(int i = 0; i < 10 ; i++){
                Produto a = produtos.get(i);
                System.out.println(a.getProduto());
            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            arquivo.close();
        }

    }
}
