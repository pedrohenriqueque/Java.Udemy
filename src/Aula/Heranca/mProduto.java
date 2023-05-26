package Aula.Heranca;
public class mProduto {
    public static void main(String[] args) {
            Livro livro = new Livro(1, "O Senhor dos Anéis", 50.0, 1.0, "J.R.R. Tolkien");
            CD cd = new CD(2, "Nevermind", 30.0, 0.5, "Nirvana");
            Software software = new Software(3, "Photos", 500.0, 2.0, "Edição de Imagem");

            System.out.println("Livro: " + livro.getDescricao() + ", Autor: " + livro.getNomeAutor() + ", Frete: R$" + livro.calcularFrete());
            System.out.println("CD: " + cd.getDescricao() + ", Banda: " + cd.getNomeBanda() + ", Frete: R$" + cd.calcularFrete());
            System.out.println("Software: " + software.getDescricao() + ", Categoria: " + software.getCategoria() + ", Frete: R$" + software.calcularFrete());
            System.out.println("==================================================================================");
            System.out.println(cd);
        }
    }