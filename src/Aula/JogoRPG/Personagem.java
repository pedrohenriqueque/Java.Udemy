package Aula.JogoRPG;

public interface Personagem {
    void contarHistoria();
    int poderEspecial();
    void adicionarItem(Item item);

    int atacar();
    int ataque1();
    int ataque2();
    void morrer();
    int numeroAleatorio(int min,int max);

}