package Aula.JogoRPG;

public class Personagem2 extends PersonagemBase{
    @Override
    public void contarHistoria(){
        System.out.println("Elysia é uma maga destemida que domina a arte da luz." +
                " Ela cresceu isolada em uma floresta mágica, onde aprendeu " +
                "a controlar a luz com perfeição.");
    }

    @Override
    public void poderEspecial() {
        int dano = 30;
        System.out.println("Elysia utilizou seu poder espeical a Tempestade de Luz e causou " +dano +" aos seus inimigos");
    }

    @Override
    public void ataque1() {
        int dano = numeroAleatorio(1,15);
        System.out.println("Elysia utilizou sua habilidade Lâmina Solar e causou"+dano);
    }

    @Override
    public void ataque2() {
        int dano = numeroAleatorio(1,8);
        System.out.println("Elysia utilizou sua habilidade Raio Fulgante e causou "+dano +"aos seus inimigos");
    }

    public Personagem2(){
        setNome("Elysia");
        setIdade(21);
        setCaracteristica(120);
    }
}
