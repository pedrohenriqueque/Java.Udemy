package Aula.Interfaces;

public class mProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto("Tenis", 549.99, 10);
        Produto p2 = new Produto("Camisa", 79.99, 5);

        int resultado = p1.compareTo(p1);

        if (resultado < 0) {
            System.out.println(p2.getNome() + " tem um preço menor que " + p1.getNome());
        } else if (resultado > 0) {
            System.out.println(p1.getNome() + " tem um preço maior que " + p2.getNome());
        } else {
            System.out.println("Os preços de " + p1.getNome() + " e " + p2.getNome() + " são iguais");
        }
    }
}