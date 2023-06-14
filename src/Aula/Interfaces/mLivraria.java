package Aula.Interfaces;

public class mLivraria {
        public static void main(String[] args) {
            Livraria livraria = new Livraria();

            Livro livro1 = new Livro("Dom Queixote", 29.99, 10, "Mark Suit", 200);
            Livro livro2 = new Livro("A Culpa é das Estrelas", 39.99, 5, "Lux Silva", 300);

            livraria.adicionarLivro(livro1);
            livraria.adicionarLivro(livro2);

            System.out.println("Estoque inicial:");
            livraria.exibir();

            livraria.adicionarEstoqueLivro(livro1, 3);
            livraria.venderLivro(livro2, 2);

            System.out.println("Estoque após operações:");
            livraria.exibir();
        }
}
