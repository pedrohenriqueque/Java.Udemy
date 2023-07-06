package Aula.JogoRPG;

import java.util.ArrayList;

public class Personagem1 extends PersonagemBase{
    @Override
    public void contarHistoria(){
        super.contarHistoria();
        System.out.println("Arthur é um antigo cavaleiro que dedicou sua vida à proteção dos inocentes e à\n" +
                "busca pela paz. Ele percorreu terras distantes em busca de conhecimentos\n" +
                "ancestrais.");
    }

    @Override
    public int poderEspecial() {
        int dano = numeroAleatorio(1,5);
        System.out.println("Arthur utilizou a seu poder especial Martelo Divino e causou" +dano + "de dano");
        for (Item item : inventario) {
            if (item instanceof TomoAmplificador) {
                dano *= 2;
            }
        }
        return dano;
    }

    @Override
    public int ataque1() {
        int dano =super.ataque1();
        System.out.println("Arthur utilizou sua habilidade Golpe Divino e causou " +dano);
        return dano;
    }

    @Override
    public int ataque2() {
        int dano = super.ataque2();
        System.out.println("Arthur utilizou sua habilidade Purificação Celeste e causou "+dano +"aos seus inimigos");
        return dano;
    }

    @Override
    public int atacar() {
        System.out.println("SUA VEZ DE ATACAR!\n"+
                "Qual habilidade deseja utilizar?\n"+
                "1 - Golpe Divino\n"+
                "2 - Purificação Celeste\n"+
                "3 - Cura Divina\n");
        return super.atacar();
    }

    public Personagem1(){
        inventario = new ArrayList<>();
        setNome("Arthur");
        setCaracteristica(100);
        setIdade(23);
    }

}
