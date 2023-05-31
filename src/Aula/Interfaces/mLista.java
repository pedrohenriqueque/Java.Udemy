package Aula.Interfaces;

public class mLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.adicionarNome("Silva");
        lista.adicionarNome("Maria");
        lista.adicionarNome("Luiz");

        lista.print();
    }
}