package Aula.JogoRPG;

import java.util.ArrayList;

public class Personagem2 extends PersonagemBase{
    @Override
    public void contarHistoria(){
        super.contarHistoria();
        System.out.println("Elysia é uma maga destemida que domina a arte da luz. Ela cresceu isolada em\n" +
                "uma floresta mágica, onde aprendeu a controlar a luz com perfeição.");
    }

    @Override
    public int poderEspecial() {
        int dano = numeroAleatorio(1,1);

        for (Item item : inventario) {
            if (item instanceof TomoAmplificador) {
                dano *= 2;
            }else if(item instanceof ChapeuDaMagia){
                dano += 5;
            }
        }
        System.out.println("Elysia utilizou seu poder especial a Tempestade de Luz e causou " +dano +" aos seus inimigos");
        return dano;
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
        inventario = new ArrayList<>();
        setNome("Elysia");
        setIdade(21);
        setCaracteristica(110);
    }
}
