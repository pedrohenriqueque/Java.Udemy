package Aula;

public class mProduto {

        public static void main(String[] args) {

            Produto produto1 = new Produto(1, 10, "Martelo", 15.99);
            Produto produto2 = new Produto(7,5,"Parafuwo",12.20);
            produto2.setNome("Parafuso");
            produto2.setPreco(0.5);
            Produto produto3 = new Produto(2, 5, "Chave de fenda", 7.99);

            System.out.println("Produtos da loja:");
            System.out.println("ID\tQuantidade\tNome\t\tPreço");
            System.out.println(produto1.getNumero() + "\t" + produto1.getQuantidade() + "\t\t" + produto1.getNome() + "\t\t" + produto1.getPreco());
            System.out.println(produto2.getNumero() + "\t" + produto2.getQuantidade() + "\t\t" + produto2.getNome() + "\t\t" + produto2.getPreco());
            System.out.println(produto3.getNumero() + "\t" + produto3.getQuantidade() + "\t\t" + produto3.getNome() + "\t" + produto3.getPreco());
        }
    }

