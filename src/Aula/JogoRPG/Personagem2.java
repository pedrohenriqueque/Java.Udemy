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
        if (usosPoderEspecial > 0) {
            usosPoderEspecial--; // Reduzir o número de usos restantes
            int dano = numeroAleatorio(31, 50);
            for (Item item : inventario) {
                if (item instanceof TomoAmplificador) {
                    dano *= 2;
                }
            }
            System.out.println("Elysia utilizou seu poder especial a Tempestade de Luz e causou " + dano + " aos seus inimigos");
            return dano;
        } else {
            System.out.println("Você não pode mais usar o poder especial. Limite de usos atingido.");
            return 0;
        }
    }

    @Override
    public int ataque1() {
       int dano =super.ataque1();
        System.out.println("Elysia utilizou sua habilidade Lâmina Solar e causou "+dano);
        return dano;

    }

    @Override
    public int ataque2() {
        int dano = super.ataque2();
        System.out.println("Elysia utilizou sua habilidade Raio Fulgante e causou "+dano +"aos seus inimigos");
        return dano;
    }

    public int atacar() {
        System.out.println("SUA VEZ DE ATACAR!\n"+
                "Qual habilidade deseja utilizar?\n"+
                "1 - Lâmina Solar\n"+
                "2 - Raio Fulgurante\n"+
                "3 - Tempestade de Luz(ESPECIAL!)");
        return super.atacar();
    }
    public Personagem2(){
        inventario = new ArrayList<>();
        setNome("Elysia");
        setIdade(21);
        setCaracteristica(110);
    }
}
